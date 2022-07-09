package com.kathanparikh.animeworld.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.kathanparikh.animeworld.databinding.ActivitySplashBinding;
import com.kathanparikh.animeworld.util.Constants;

public class SplashActivity extends AppCompatActivity {

    //Layout file
    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout binding and content view
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    /**
     * Starting method
     */
    private void init() {
        setRandomQuote();
        setHandlerToNextScreen();
    }

    /**
     * This method will select a random quote from array and set it in text view.
     */
    private void setRandomQuote() {
        int randomQuoteNUmber = (int) (Math.random() * Constants.animeQuotes.length);
        binding.animeQuoteTextView.setText(Constants.animeQuotes[randomQuoteNUmber]);
    }

    /**
     * This method will send intent from SplashActivity to HomeActivity after 3 seconds.
     */
    private void setHandlerToNextScreen() {
        new Handler().postDelayed(() -> {
            Intent homeActivityIntent = new Intent(SplashActivity.this, HomeActivity.class);
            startActivity(homeActivityIntent);
            SplashActivity.this.finishAffinity();
        }, 3000);
    }

}