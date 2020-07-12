package com.example.cakeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the cakes category
        TextView cakes = (TextView) findViewById(R.id.cakes);

        // Set a click listener on that View
        cakes.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the cakes category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CakesActivity}
                Intent cakesIntent = new Intent(MainActivity.this, CakesActivity.class);

                // Start the new activity
                startActivity(cakesIntent);
            }
        });

        // Find the View that shows the desserts category
        TextView desserts = (TextView) findViewById(R.id.desserts);

        // Set a click listener on that View
        desserts.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the desserts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DessertsActivity}
                Intent dessertsIntent = new Intent(MainActivity.this, DessertsActivity.class);

                // Start the new activity
                startActivity(dessertsIntent);
            }
        });

        // Find the View that shows the coffee category
        TextView coffee = (TextView) findViewById(R.id.coffee);

        // Set a click listener on that View
        coffee.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the coffee category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CoffeeActivity}
                Intent coffeeIntent = new Intent(MainActivity.this, CoffeeActivity.class);

                // Start the new activity
                startActivity(coffeeIntent);
            }
        });

        // Find the View that shows the drinks category
        TextView drinks = (TextView) findViewById(R.id.drinks);

        // Set a click listener on that View
        drinks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the drinks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DrinksActivity}
                Intent drinksIntent = new Intent(MainActivity.this, DrinksActivity.class);

                // Start the new activity
                startActivity(drinksIntent);
            }
        });
    }
}
