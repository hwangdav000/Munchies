package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FriendsRecommendations extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_recommendations);

        // implements navigation to different activities
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.foodIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.favoriteIc:
                startActivity(new Intent(this, FavoritePage.class));
                return true;

            case R.id.profileIc:
                startActivity(new Intent(this, Profile.class));
                return true;

            case R.id.foodIc:
                startActivity(new Intent(this, RecommendPage.class));
                return true;
        }
        return true;
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