package com.example.csci5115_munchies;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.RatingBar;

import com.example.csci5115_munchies.databinding.ActivityRecipePageBinding;

public class RecipePage extends AppCompatActivity {

    private ActivityRecipePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating((float) 3.56);
    }
}