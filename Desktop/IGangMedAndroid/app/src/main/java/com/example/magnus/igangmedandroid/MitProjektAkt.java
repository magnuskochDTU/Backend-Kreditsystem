package com.example.magnus.igangmedandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MitProjektAkt extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mit_projekt_akt);

        Button brugernavnKnap = (Button) findViewById(R.id.brugernavnKnap);
        brugernavnKnap.setOnClickListener(this);
        Button goToWeb = (Button) findViewById(R.id.goToWeb);
        goToWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Switch case håndtere de forskellige knapper og deres operationer
        switch (view.getId()) {
            case R.id.brugernavnKnap :
                brugernavnFunktion();
                break;
            case R.id.goToWeb :
                goToWebFunktion();
                break;
        }
    }

    public void brugernavnFunktion () {
        System.out.println("Der blev trykket");
        TextView velkommenTekst = (TextView) findViewById(R.id.textView);
        TextView brugernavn = (TextView) findViewById(R.id.editText);
        velkommenTekst.setText("Velkommen "+brugernavn.getText());
    }

    public void goToWebFunktion () {
        startActivity(new Intent(this, WebviewAkt.class));
    }
}
