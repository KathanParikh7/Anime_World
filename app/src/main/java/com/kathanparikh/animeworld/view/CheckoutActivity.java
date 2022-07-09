package com.kathanparikh.animeworld.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kathanparikh.animeworld.databinding.ActivityCheckoutBinding;

public class CheckoutActivity extends AppCompatActivity {

    //Layout file
    private ActivityCheckoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout binding and content view
        binding = ActivityCheckoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    /**
     * Starting method
     */
    private void init() {
    }
}