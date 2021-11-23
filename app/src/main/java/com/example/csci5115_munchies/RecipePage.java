package com.example.csci5115_munchies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.ToggleButton;

import com.example.csci5115_munchies.databinding.ActivityRecipePageBinding;

public class RecipePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating((float) 3.56);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.favoriteButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle.setBackgroundResource(R.drawable.favorite_fill);
                } else {
                    toggle.setBackgroundResource(R.drawable.favorite_border);
                }
            }
        });
    }
}