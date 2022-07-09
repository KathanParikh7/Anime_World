package com.kathanparikh.animeworld.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.kathanparikh.animeworld.databinding.ItemProductBinding;
import com.kathanparikh.animeworld.model.Anime;

import java.util.List;
import java.util.Locale;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private final Context context;
    private final LayoutInflater inflater;
    private final ProductClickListener productClickListener;
    private final List<Anime> animeList;

    public ProductAdapter(Context context, List<Anime> animeList, ProductClickListener productClickListener) {
        this.context = context;
        this.animeList = animeList;
        this.productClickListener = productClickListener;
        this.inflater = LayoutInflater.from(this.context);
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemProductBinding binding = ItemProductBinding.inflate(inflater, parent, false);
        return new ProductAdapter.ProductViewHolder(binding, productClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.bind(animeList.get(position), position);
    }

    @Override
    public int getItemCount() {
        if (animeList == null) {
            return 0;
        }
        return animeList.size();
    }

    public interface ProductClickListener {
        void onProductClick(int position);
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        private final ItemProductBinding binding;
        private final ProductClickListener productClickListener;

        public ProductViewHolder(@NonNull ItemProductBinding itemView, ProductClickListener productClickListener) {
            super(itemView.getRoot());
            this.binding = itemView;
            this.productClickListener = productClickListener;
        }

        public void bind(Anime animeItem, int position) {
            //Set anime icon
            binding.itemProductIconImageView.setImageDrawable(ContextCompat.getDrawable(binding.getRoot().getContext(), animeItem.getAnimeSmallImage()));

            //Set anime title
            binding.itemProductTitleTextView.setText(animeItem.getAnimeName());

            //Set anime price
            String animePrice = String.format(Locale.getDefault(), "$ %.2f", animeItem.getAnimePrice());
            binding.itemProductPriceTextView.setText(animePrice);

            //Set anime rating
            String animeRating = String.format(Locale.getDefault(), "%.2f / 5.0", animeItem.getAnimeRating());
            binding.itemProductRatingTextView.setText(animeRating);

            //Set click listener to details activity
            binding.itemProductConstraintLyt.setOnClickListener(v -> productClickListener.onProductClick(position));
        }
    }
}
