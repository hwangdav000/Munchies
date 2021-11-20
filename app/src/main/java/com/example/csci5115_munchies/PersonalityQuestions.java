package com.example.csci5115_munchies;

public class PersonalityQuestions {
    private final String[] Questions = {
        "What is your favorite\n subject in class?",
        "Which of these colors do you prefer?",
        "Are you an introvert or an extrovert?"
    };
    private final String[][] Choices = {
            {"Gym", "Math/Science", "Art"},
            {"Blue", "Green", "Red"},
            {"Introvert", "Extrovert", "Neither"}
    };

    public int getSize(){
        return Questions.length;
    }

    public String getQuestion(int a){
        return Questions[a];
    }

    public String getChoice0(int a){
        return Choices[a][0];
    }

    public String getChoice1(int a){
        return Choices[a][1];
    }

    public String getChoice2(int a){
        return Choices[a][2];
    }
}
