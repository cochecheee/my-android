package com.example.my_linkedin_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.my_linkedin_3.databinding.ActivityViewBindingMainBinding;

public class viewBindingMainActivity extends AppCompatActivity {

    ActivityViewBindingMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewBindingMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        binding.txtHello.setText("Hello World!! Iam from Binding Method!");
        //setContentView(R.layout.activity_view_binding_main);
        setContentView(view);

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String emil = binding.editTextTextEmailAddress.getText().toString();
                 String pass = binding.editTextNumberPassword.getText().toString();

                 Log.i("ViewBindingMainActivity",emil + " " + pass);
             }
        });
    }
}