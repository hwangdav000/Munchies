package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_user);

        Button button = (Button) findViewById(R.id.editConfirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backProfile();
            }
        });
    }

    public void backProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}