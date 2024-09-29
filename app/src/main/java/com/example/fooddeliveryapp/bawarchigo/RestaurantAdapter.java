package com.example.fooddeliveryapp.bawarchigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private Context context;
    private List<Restaurant> restaurantList;

    // Constructor
    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_restaurant_card, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);

        // Set data to views
        holder.restaurantName.setText(restaurant.getName());
        holder.restaurantDistance.setText(restaurant.getDistance());
        holder.restaurantRating.setText(restaurant.getRating());
        holder.restaurantImage.setImageResource(restaurant.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    // ViewHolder class
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {

        TextView restaurantName, restaurantDistance, restaurantRating;
        ImageView restaurantImage;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            // Initialize views
            restaurantName = itemView.findViewById(R.id.restaurantName);
            restaurantDistance = itemView.findViewById(R.id.restaurantDistance);
            restaurantRating = itemView.findViewById(R.id.restaurantRating);
            restaurantImage = itemView.findViewById(R.id.restaurantImage);
        }
    }
}
