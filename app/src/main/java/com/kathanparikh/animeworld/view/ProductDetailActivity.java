package com.kathanparikh.animeworld.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.kathanparikh.animeworld.data.ProductRepository;
import com.kathanparikh.animeworld.databinding.ActivityProductDetailBinding;
import com.kathanparikh.animeworld.model.Anime;

import java.util.Locale;

public class ProductDetailActivity extends AppCompatActivity {

    //Layout file
    private ActivityProductDetailBinding binding;

    //Product
    private Anime productItem = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout binding and content view
        binding = ActivityProductDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    /**
     * Starting method
     */
    private void init() {
        getProductFromItemPosition();
        setUpProductDetails();
        setListeners();
    }

    /**
     * Get position of product item
     */
    private void getProductFromItemPosition() {
        final Intent intent = getIntent();
        //Product item position
        int productItemPosition = intent.getIntExtra(ProductActivity.PRODUCT_POSITION, -1);
        if (productItemPosition != -1) {
            productItem = ProductRepository.getAnimeList().get(productItemPosition);
        }
    }

    /**
     * Set up product details
     */
    private void setUpProductDetails() {
        if (productItem == null) return;

        //Product banner image
        binding.productDetailsImageView.setImageDrawable(ContextCompat.getDrawable(this, productItem.getAnimeBannerImage()));

        //Product title
        binding.productDetailsTitleTextView.setText(productItem.getAnimeName());

        //Set product price
        String animePrice = String.format(Locale.getDefault(), "$ %.2f", productItem.getAnimePrice());
        binding.productDetailsPriceTextView.setText(animePrice);

        //Set product rating
        String animeRating = String.format(Locale.getDefault(), "%.2f / 5.0", productItem.getAnimeRating());
        binding.productRatingTextView.setText(animeRating);

        //Set product release year
        String releaseYear = String.format(Locale.getDefault(), "Release Year: %d", productItem.getAnimeReleaseYear());
        binding.productDetailsReleaseYearTextView.setText(releaseYear);

        //Set product seasons and episodes
        binding.productDetailsSeasonsYearTextView.setText(productItem.getAnimeSeasons());

        //Set product description
        binding.productDetailsDescriptionTextView.setText(productItem.getAnimeDescription());
    }

    /**
     * Set listeners
     */
    private void setListeners() {
        binding.productDetailsCheckOutButton.setOnClickListener(v -> {
            Intent checkoutActivity = new Intent(ProductDetailActivity.this, CheckoutActivity.class);
            startActivity(checkoutActivity);
        });
    }

}