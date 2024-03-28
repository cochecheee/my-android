package com.example.my_linkedin_8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.my_linkedin_8.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    //tạo view Model đễ lấy data
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //nếu dữ liệu info thay đổi thực hiện
        viewModel.Pinfo.observe(this, integer -> {
            // Thực hiện hành động khi giá trị của info thay đổi
            displaySnackbar();
        });
        setSupportActionBar(binding.toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_share)
            handleShare();
        else
            return super.onOptionsItemSelected(item);
        return true;
    }

    private boolean handleShare()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "I just purchased " + viewModel.Pinfo.getValue() + " bottles of olive oil!");
        startActivity(intent);
        return true;
    }
    private void displaySnackbar()
    {
        Snackbar.make(binding.getRoot(),"Info has changed!",Snackbar.LENGTH_LONG).show();
    }
}