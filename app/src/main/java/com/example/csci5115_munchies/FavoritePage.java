package com.example.csci5115_munchies;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.csci5115_munchies.databinding.ActivityFavoritePageBinding;

public class FavoritePage extends AppCompatActivity {

    private ActivityFavoritePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFavoritePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


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

    }

}