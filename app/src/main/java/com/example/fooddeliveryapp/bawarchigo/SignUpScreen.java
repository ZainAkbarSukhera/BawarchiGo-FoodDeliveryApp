package com.example.fooddeliveryapp.bawarchigo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button signUpButtonMain = findViewById(R.id.buttonSignupScreenMain);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set OnClickListener for Signup button
        signUpButtonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate to SignupScreen
                Intent intent = new Intent(SignUpScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}

