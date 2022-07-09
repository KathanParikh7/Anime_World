package com.kathanparikh.animeworld.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kathanparikh.animeworld.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    //Layout file
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout binding and content view
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    /**
     * Starting method
     */
    private void init() {
        setListeners();
    }

    /**
     * Set listeners
     */
    private void setListeners() {
        binding.buyAnimeButton.setOnClickListener(v -> {
            Intent productActivityIntent = new Intent(HomeActivity.this, ProductActivity.class);
            startActivity(productActivityIntent);
        });
    }
}