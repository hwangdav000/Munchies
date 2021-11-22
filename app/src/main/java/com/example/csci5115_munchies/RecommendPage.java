package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RecommendPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_page);

        ImageButton personalityButton = (ImageButton) findViewById(R.id.imageButton);
        personalityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, PersonalityStart.class));
            }
        });

        ImageButton ingredientsButton = (ImageButton) findViewById(R.id.imageButton2);
        ingredientsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, RecipePage.class));
            }
        });

        ImageButton friendsButton = (ImageButton) findViewById(R.id.imageButton3);
        friendsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(RecommendPage.this, FriendsRecommendations.class));
            }
        });
    }

    /*
    public void goToFriendsRec(View view){
        Intent intent = new Intent(this, FriendsRecommendations.class);
        startActivity(intent);
    }
    */

}