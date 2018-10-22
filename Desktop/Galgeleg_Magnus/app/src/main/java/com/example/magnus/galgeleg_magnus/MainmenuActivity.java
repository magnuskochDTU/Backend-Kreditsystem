package com.example.magnus.galgeleg_magnus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainmenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        //Setting ClickListeninger on the buttons
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        Button highscoreButton = (Button) findViewById(R.id.highscoreButton);
        highscoreButton.setOnClickListener(this);
        Button helpButton = (Button) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Switch case håndtere de forskellige knapper og deres operationer
        switch (view.getId()) {
            case R.id.startButton :
                startActivity(new Intent(this, GameActivity.class));
                break;
            case R.id.highscoreButton :
                startActivity(new Intent(this,HighscoreActivity.class));
                break;
            case R.id.helpButton :
                startActivity(new Intent(this, HelpActivity.class));
                break;
        }
    }

}
