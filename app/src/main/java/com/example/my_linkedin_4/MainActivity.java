package com.example.my_linkedin_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;

import com.example.my_linkedin_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //tại sao phải set binding getRoot()
        setContentView(binding.getRoot());

        newIcon();
        binding.oliveSwitch.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            if (isChecked)
                binding.oliveImage.setImageResource(R.drawable.olive_branch);
            else
                binding.oliveImage.setImageResource(R.drawable.olive_branch_vector);
        });
    }

    private void newIcon(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setLogo(R.drawable.ic_launcher_new_foreground);
        }

    }
}

