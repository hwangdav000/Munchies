package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FriendsRecommendations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_recommendations);
    }

    public void goToBatman(View view){
        Intent intent = new Intent(this, Batman.class);
        startActivity(intent);
    }

    public void goToZuko(View view){
        Intent intent = new Intent(this, Zuko.class);
        startActivity(intent);
    }

    public void goToKaren(View view){
        Intent intent = new Intent(this, Karen.class);
        startActivity(intent);
    }
}