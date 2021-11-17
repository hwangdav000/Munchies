package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.csci5115_munchies.PersonalityQuizActivity;

public class PersonalityStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_start);
    }

    /** Start button starts the quiz */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, PersonalityQuizActivity.class);
        startActivity(intent);
    }

}