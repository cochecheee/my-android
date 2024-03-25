package com.example.my_linkedin_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.example.my_linkedin_7.databinding.ActivityChallengeBinding;
import com.google.android.material.snackbar.Snackbar;

public class ChallengeActivity extends AppCompatActivity {

    private ActivityChallengeBinding binding;
    private ChallengeViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChallengeBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(ChallengeViewModel.class);


        binding.addQuantityButton.setOnClickListener(v -> viewModel.increaseQuantity());
        binding.removeQuantityButton.setOnClickListener(v -> viewModel.decreaseQuantity());
        binding.checkoutButton.setOnClickListener(v -> viewModel.checkout());
        //nếu due lieu biến thay đồi gõi hàm
        viewModel.Pquantity.observe(this, value ->
                updateTotal(value)
                );
        viewModel.PtotalAmount.observe( this, value ->
                Snackbar.make(binding.getRoot(), getString(R.string.total_amount, value), Snackbar.LENGTH_LONG).show()

        );
        setContentView(binding.getRoot());
    }

    private void updateTotal(int value) {
        binding.total.setText(String.valueOf(value));
    }
}