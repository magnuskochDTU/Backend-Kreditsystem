package com.example.magnus.galgeleg_magnus;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class HighscoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
    }

    /*private List<Integer> getHighscores () {
        SharedPreferences prefs = this.getSharedPreferences("Highscores", Context.MODE_PRIVATE);
        for (int score : prefs.getInt("score"))
        int score = prefs.getInt("score", 0);
        return
    }

    private void addScore (int score) {
        SharedPreferences prefs = this.getSharedPreferences("Highscores", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("score", score);
        editor.commit();
    }*/
}
