package com.example.my_linkedin_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.my_linkedin_4.databinding.ActivityChallengeBinding;
import com.squareup.picasso.Picasso;

public class challengeActivity extends AppCompatActivity {
    private ActivityChallengeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChallengeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked)
            {
                String imageUrl = "https://kenh14cdn.com/thumb_w/620/203336854389633024/2022/5/25/photo-1-1653461340935426739125.jpg";
                Picasso.get().load(imageUrl).into(binding.imageView);
            }else
            {
                String imageUrl = "https://static1.srcdn.com/wordpress/wp-content/uploads/2022/09/Spy-X-Familys-Yor-and-Anya.jpg";
                Picasso.get().load(imageUrl).into(binding.imageView);
            }
        });
    }
}