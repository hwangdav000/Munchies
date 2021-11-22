package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngredientsRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_recommendation);
    }
    public void goToRecipe(View view){
        Intent intent = new Intent(this, RecipePage.class);
        startActivity(intent);
    }
    public void goToIngredient2(View view){
        Intent intent = new Intent(this, IngredientsRecommendation2.class);
        startActivity(intent);
    }
}