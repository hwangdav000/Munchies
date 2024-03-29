package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Login extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        button = findViewById(R.id.button);
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

    public void signUp(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}