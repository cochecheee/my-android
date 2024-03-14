package com.example.my_linkedin_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.my_linkedin_3.databinding.ActivityChallengeMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class challengeMainActivity extends AppCompatActivity {
    //tạo binding ánh xạ đến xml
    ActivityChallengeMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChallengeMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        binding.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.txtFirstname.getText().toString();
                String favColor = binding.txtFavcolor.getText().toString();
                String favSnack = binding.txtFavsnack.getText().toString();
                String message = getString(R.string.message,name,favColor,favSnack);

                Snackbar.make(view,message,Snackbar.LENGTH_INDEFINITE).show();
            }
        });

        setContentView(view);
    }
}