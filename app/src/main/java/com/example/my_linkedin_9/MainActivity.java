package com.example.my_linkedin_9;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.my_linkedin_9.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Set listener for bottom navigation view
        binding.bottomNavigation.setOnItemSelectedListener(this);

        //Dat home hiển thị đầu
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(binding.container.getId(), new HomeFragment());
        transaction.commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment;
        if (item.getItemId() == R.id.action_home) {
            fragment = new HomeFragment();
        } else if (item.getItemId() == R.id.action_tours) {
            fragment = new ToursFragment();
        } else if (item.getItemId() == R.id.action_shop) {
            fragment = new ShopFragment();
        }else return false;

        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.container.getId(), fragment)
                .commit();
        return true;
    }
    public void setOnNavigationItemSelectedListener (BottomNavigationView.OnItemSelectedListener listener)
    {

    }
}