package com.example.fooddeliveryapp.bawarchigo;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddeliveryapp.bawarchigo.databinding.ActivityHomeScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    private ActivityHomeScreenBinding binding;
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    private RecyclerView rvRestaurants;
    private RestaurantAdapter adapter;
    private List<Restaurant> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize view binding
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = binding.navView;

        // Updated menu IDs: home, cart, notifications, and settings
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_cart, R.id.navigation_notifications, R.id.navigation_settings)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.navigation_home);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        // Initialize the RecyclerView for categories
        recyclerView = binding.rvCategories;

        // Set a Horizontal LayoutManager for categories
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the category list
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Burgers", R.drawable.burger)); // Add your categories
        categoryList.add(new Category("Pizza", R.drawable.pizza));
        categoryList.add(new Category("Fast Food", R.drawable.fastfood));
        categoryList.add(new Category("Chinese", R.drawable.chinese));
        categoryList.add(new Category("Italian", R.drawable.italian));
        categoryList.add(new Category("Desi", R.drawable.desi));
        categoryList.add(new Category("Continental", R.drawable.continental));
        categoryList.add(new Category("Desserts", R.drawable.dessert));
        categoryList.add(new Category("Seafood", R.drawable.seafood));
        categoryList.add(new Category("HomeMade", R.drawable.homemade));

        // Set the adapter for categories
        categoryAdapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(categoryAdapter);

        // Initialize the RecyclerView for restaurants
        rvRestaurants = binding.rvRestaurants;

        // Initialize restaurant list
        restaurantList = new ArrayList<>();
        populateRestaurantList();

        // Set up RecyclerView for restaurants
        rvRestaurants.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RestaurantAdapter(this, restaurantList);
        rvRestaurants.setAdapter(adapter);
    }

    private void populateRestaurantList() {
        // Add sample data (imageResourceId refers to drawable resources in res/drawable)
        restaurantList.add(new Restaurant("Pizza Palace", "2.5 km", "4.3 ★", R.drawable.restaurant1));
        restaurantList.add(new Restaurant("Burger Hub", "1.8 km", "4.6 ★", R.drawable.restaurant2));
        restaurantList.add(new Restaurant("Sushi World", "3.2 km", "4.2 ★", R.drawable.restaurant3));
        restaurantList.add(new Restaurant("Pasta House", "4.5 km", "4.5 ★", R.drawable.restaurant4));
        restaurantList.add(new Restaurant("Taco Haven", "5.0 km", "4.1 ★", R.drawable.restaurant5));
    }
}
