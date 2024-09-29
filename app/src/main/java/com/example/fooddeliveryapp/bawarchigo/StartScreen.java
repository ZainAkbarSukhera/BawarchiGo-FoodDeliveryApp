package com.example.fooddeliveryapp.bawarchigo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        // Enable Edge to Edge after setting the content view
        EdgeToEdge.enable(this);

        // Initialize buttons after setting the content view
        Button loginButton = findViewById(R.id.buttonLoginStartScreen);
        Button signupButton = findViewById(R.id.buttonSignupStartScreen);

        // Set up padding for the main view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set OnClickListener for Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to LoginScreen
                Intent intent = new Intent(StartScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });

        // Set OnClickListener for Signup button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to SignupScreen
                Intent intent = new Intent(StartScreen.this, SignUpScreen.class);
                startActivity(intent);
            }
        });
    }
}
