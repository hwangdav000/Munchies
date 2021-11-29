package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Register extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        button = (Button) findViewById(R.id.toHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

    }

    public void openHome() {
        Intent intent = new Intent(this, FavoritePage.class);
        startActivity(intent);
    }

    public void backLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}