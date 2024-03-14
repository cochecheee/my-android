package com.example.my_linkedin_3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.TelephonyNetworkSpecifier;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout my_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        addSomeViews(3);
    }

    //add some view by code
    private void addSomeViews(int count)
    {
        for (int i = 0; i < count; i++) {
            TextView Text = new TextView(this);
            Text.setText(String.format("Hello # %d", i));
            Text.setTextSize(20);
            my_layout.addView(Text);
        }
        Button btn = new Button(this);
        btn.setText("Click click");
        my_layout.addView(btn);
    }

    private void anhXa()
    {
        my_layout = findViewById(R.id.my_layout);
    }

}

