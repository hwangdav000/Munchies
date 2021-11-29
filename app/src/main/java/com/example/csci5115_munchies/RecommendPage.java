package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecommendPage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_page);

        ImageButton personalityButton = (ImageButton) findViewById(R.id.imageButton);
        personalityButton.setBackgroundResource(R.drawable.roundedcorners);
        personalityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, PersonalityStart.class));
            }
        });

        ImageButton ingredientsButton = (ImageButton) findViewById(R.id.imageButton2);
        ingredientsButton.setBackgroundResource(R.drawable.roundedcorners);
        ingredientsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, IngredientsRecommendation.class));
            }
        });

        ImageButton friendsButton = (ImageButton) findViewById(R.id.imageButton3);
        friendsButton.setBackgroundResource(R.drawable.roundedcorners);
        friendsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, FriendsRecommendations.class));
            }
        });
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.foodIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    /*
    public void goToFriendsRec(View view){
        Intent intent = new Intent(this, FriendsRecommendations.class);
        startActivity(intent);
    }
    */

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
}