package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Batman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.samplefriend_batman);
    }
    public void goToRecipe(View view){
        Intent intent = new Intent(this, RecipePage.class);
        startActivity(intent);
    }
}