package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PersonalityQuizRecommendation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_quiz_recommendation);
        LinearLayout layout =(LinearLayout)findViewById(R.id.potatoSoupButton);
        layout.setBackgroundResource(R.drawable.roundedcorners);
        layout =(LinearLayout)findViewById(R.id.personalityReco2);
        layout.setBackgroundResource(R.drawable.roundedcorners);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.foodIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    /** Clicking recipe goes to page */
    public void gotoRecipe(View view) {
        Intent intent = new Intent(this, RecipePage.class);
        startActivity(intent);
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
}