package com.example.my_linkedin_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.my_linkedin_7.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private int count = 0; //test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ánh xạ file .xml vào file main java
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //biến tham chiếu đến viewmodel
        // Initialize the ViewModel
        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.pInfo.observe(this, value ->
                displaySnackbar(value)
        );

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /// nhận xét khi quay màn hình thì nó mất hoàn toàdu74du lieu set o man hinh cu
                //count += 1;
                //displaySnackbar(count);
                viewModel.loadData();
            }
        });
    }
    private void displaySnackbar(Integer val) {
        Snackbar.make(binding.getRoot(),String.format("current value: %s", val),Snackbar.LENGTH_LONG).show();
    }
}