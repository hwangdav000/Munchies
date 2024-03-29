package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PersonalityQuizActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private final PersonalityQuestions questionLibrary = new PersonalityQuestions();
    private int questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_quiz);

        // implements navigation to different activities
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.foodIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.favoriteIc:
                startActivity(new Intent(this, FavoritePage.class));
                return true;

            case R.id.profileIc:
                startActivity(new Intent(this, Profile.class));
                return true;

            case R.id.foodIc:
                startActivity(new Intent(this, RecommendPage.class));
                return true;
        }
        return true;
    }

    /** Clicking an answer goes to next question */
    public void nextQuestion(View view) {
        updateQuestion(0);
    }

    /** Clicking an answer goes to next question */
    public void previousQuestion(View view) {
        updateQuestion(1);
    }

    /** Next Question
     *
     * int a is either 0 for next question, or 1 to go back a question
     *
     * */
    private void updateQuestion(int a){
        if (a == 0){
            // check if reached last question
            if (questionNum >= questionLibrary.getSize()-1){
                Intent intent = new Intent(this, PersonalityQuizRecommendation.class);
                startActivity(intent);
                finish();
                return;
            }
            questionNum++;
        } else {
            // if you click back at the first question, leave quiz
            if (questionNum == 0){
                Intent intent = new Intent(this, PersonalityStart.class);
                startActivity(intent);
                finish();
                return;
            }
            questionNum--;
        }

        TextView qText= findViewById(R.id.question);
        qText.setText(questionLibrary.getQuestion(questionNum));
        TextView c0Text= findViewById(R.id.Choice0);
        c0Text.setText(questionLibrary.getChoice0(questionNum));
        TextView c1Text= findViewById(R.id.Choice1);
        c1Text.setText(questionLibrary.getChoice1(questionNum));
        TextView c2Text= findViewById(R.id.Choice2);
        c2Text.setText(questionLibrary.getChoice2(questionNum));
    }


}