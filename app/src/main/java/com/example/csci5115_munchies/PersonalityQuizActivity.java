package com.example.csci5115_munchies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PersonalityQuizActivity extends AppCompatActivity {

    private final PersonalityQuestions questionLibrary = new PersonalityQuestions();
    private int questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_quiz);
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
            if (questionNum == questionLibrary.getSize()-1){
                exitQuiz();
            }
            questionNum++;
        } else {
            // if you click back at the first question, leave quiz
            if (questionNum == 0){
                exitQuiz();
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

    /** Start button starts the quiz */
    public void exitQuiz() {
        Intent intent = new Intent(this, PersonalityStart.class);
        startActivity(intent);
    }

}