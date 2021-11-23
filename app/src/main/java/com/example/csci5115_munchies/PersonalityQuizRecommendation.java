package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PersonalityQuizRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_quiz_recommendation);
        LinearLayout layout =(LinearLayout)findViewById(R.id.potatoSoupButton);
        layout.setBackgroundResource(R.drawable.roundedcorners);
        layout =(LinearLayout)findViewById(R.id.personalityReco2);
        layout.setBackgroundResource(R.drawable.roundedcorners);
    }

    /** Clicking recipe goes to page */
    public void gotoRecipe(View view) {
        Intent intent = new Intent(this, RecipePage.class);
        startActivity(intent);
    }
}