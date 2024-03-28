package com.example.my_linkedin_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EntryActivity extends AppCompatActivity {

    private Button btn_navigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        anhxa();
        btn_navigate.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void anhxa()
    {
        btn_navigate = findViewById(R.id.btn_navigate);
    }
}