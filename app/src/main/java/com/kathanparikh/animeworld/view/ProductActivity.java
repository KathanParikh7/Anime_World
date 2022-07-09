package com.kathanparikh.animeworld.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.kathanparikh.animeworld.adapter.ProductAdapter;
import com.kathanparikh.animeworld.data.ProductRepository;
import com.kathanparikh.animeworld.databinding.ActivityProductBinding;
import com.kathanparikh.animeworld.model.Anime;

import java.util.List;

public class ProductActivity extends AppCompatActivity implements ProductAdapter.ProductClickListener {

    //Product position constant
    public static final String PRODUCT_POSITION = "com.kathanparikh.animeworld.view.PRODUCT_POSITION";
    //Layout file
    private ActivityProductBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout binding and content view
        binding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    /**
     * Starting method
     */
    private void init() {
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        //Get anime movies data
        final List<Anime> animeList = ProductRepository.getAnimeList();

        //Set up adapter
        ProductAdapter productAdapter = new ProductAdapter(this, animeList, this);

        //Attach adapter to recyclerview
        binding.productListRecyclerView.setAdapter(productAdapter);
        binding.productListRecyclerView.setHasFixedSize(true);
        binding.productListRecyclerView.setVisibility(View.VISIBLE);
    }

    /**
     * Method called when any product item is clicked
     *
     * @param position of product
     */
    @Override
    public void onProductClick(int position) {
        Intent productDetailsIntent = new Intent(ProductActivity.this, ProductDetailActivity.class);
        productDetailsIntent.putExtra(PRODUCT_POSITION, position);
        startActivity(productDetailsIntent);
    }
}