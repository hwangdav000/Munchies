package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Profile extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        button = (Button) findViewById(R.id.logout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLogin();
            }
        });

        button = (Button) findViewById(R.id.editName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName();
            }
        });

        button = (Button) findViewById(R.id.addFriend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFriend();
            }
        });
    }

    public void backLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void editName() {
        Intent intent = new Intent(this, EditName.class);
        startActivity(intent);
    }

    public void addFriend() {
        Intent intent = new Intent(this, AddFriend.class);
        startActivity(intent);
    }
}