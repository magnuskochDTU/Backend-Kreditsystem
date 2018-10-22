package com.example.magnus.galgeleg_magnus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        danishText();

        //Setting ClickListeninger on the buttons
        Button danishButton = (Button) findViewById(R.id.danishButton);
        danishButton.setOnClickListener(this);
        Button englishButton = (Button) findViewById(R.id.englishButton);
        englishButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.danishButton :
                danishText();
                break;
            case R.id.englishButton :
                englishText();
                break;
        }
    }

    private void englishText () {
        TextView textView = (TextView)findViewById(R.id.rules);
        textView.setText("English text");
    }

    private void danishText () {
        TextView textView = (TextView)findViewById(R.id.rules);
        textView.setText("Dansk tekst");
    }
}
