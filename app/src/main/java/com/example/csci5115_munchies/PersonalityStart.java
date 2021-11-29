package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.csci5115_munchies.PersonalityQuizActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PersonalityStart extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_start);

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

    /** Start button starts the quiz */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, PersonalityQuizActivity.class);
        startActivity(intent);
    }

}