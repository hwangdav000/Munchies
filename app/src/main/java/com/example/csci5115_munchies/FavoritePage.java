package com.example.csci5115_munchies;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoritePage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_page);

        ImageButton recipeButton = (ImageButton) findViewById(R.id.imageButton4);
        recipeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FavoritePage.this, RecipePage.class));
            }
        });

        Button recommendButton = (Button) findViewById(R.id.button3);
        recommendButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FavoritePage.this, RecommendPage.class));
            }
        });
        // implements navigation to different activities
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.favoriteIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.favoriteIc:
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


}