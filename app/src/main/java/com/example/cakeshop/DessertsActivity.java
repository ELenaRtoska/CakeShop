package com.example.cakeshop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DessertsFragment())
                .commit();
    }
}