package com.example.magnus.galgeleg_magnus;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private Galgelogik galgelogik = new Galgelogik();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        galgelogik.nulstil();
        Button aButton = (Button) findViewById(R.id.aButton);
        aButton.setOnClickListener(this);
        Button bButton = (Button) findViewById(R.id.bButton);
        bButton.setOnClickListener(this);
        Button cButton = (Button) findViewById(R.id.cButton);
        cButton.setOnClickListener(this);
        Button dButton = (Button) findViewById(R.id.dButton);
        dButton.setOnClickListener(this);
        Button eButton = (Button) findViewById(R.id.eButton);
        eButton.setOnClickListener(this);
        Button fButton = (Button) findViewById(R.id.fButton);
        fButton.setOnClickListener(this);
        Button gButton = (Button) findViewById(R.id.gButton);
        gButton.setOnClickListener(this);
        Button hButton = (Button) findViewById(R.id.hButton);
        hButton.setOnClickListener(this);
        Button iButton = (Button) findViewById(R.id.iButton);
        iButton.setOnClickListener(this);
        Button jButton = (Button) findViewById(R.id.jButton);
        jButton.setOnClickListener(this);
        Button kButton = (Button) findViewById(R.id.kButton);
        kButton.setOnClickListener(this);
        Button lButton = (Button) findViewById(R.id.lButton);
        lButton.setOnClickListener(this);
        Button mButton = (Button) findViewById(R.id.mButton);
        mButton.setOnClickListener(this);
        Button nButton = (Button) findViewById(R.id.nButton);
        nButton.setOnClickListener(this);
        Button oButton = (Button) findViewById(R.id.oButton);
        oButton.setOnClickListener(this);
        Button pButton = (Button) findViewById(R.id.pButton);
        pButton.setOnClickListener(this);
        Button qButton = (Button) findViewById(R.id.qButton);
        qButton.setOnClickListener(this);
        Button rButton = (Button) findViewById(R.id.rButton);
        rButton.setOnClickListener(this);
        Button sButton = (Button) findViewById(R.id.sButton);
        sButton.setOnClickListener(this);
        Button tButton = (Button) findViewById(R.id.tButton);
        tButton.setOnClickListener(this);
        Button uButton = (Button) findViewById(R.id.uButton);
        uButton.setOnClickListener(this);
        Button vButton = (Button) findViewById(R.id.vButton);
        vButton.setOnClickListener(this);
        Button xButton = (Button) findViewById(R.id.xButton);
        xButton.setOnClickListener(this);
        Button yButton = (Button) findViewById(R.id.yButton);
        yButton.setOnClickListener(this);
        Button zButton = (Button) findViewById(R.id.zButton);
        zButton.setOnClickListener(this);
        Button æButton = (Button) findViewById(R.id.æButton);
        æButton.setOnClickListener(this);
        Button øButton = (Button) findViewById(R.id.øButton);
        øButton.setOnClickListener(this);
        Button åButton = (Button) findViewById(R.id.åButton);
        åButton.setOnClickListener(this);

        TextView visibleWord = (TextView) findViewById(R.id.visibleWord);
        visibleWord.setText(galgelogik.getSynligtOrd());
    }

    @Override
    public void onClick(View view) {
        String letter = null;
        Button button = null;
        switch (view.getId()) {
            case R.id.aButton :
                letter = "a";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.aButton);
                button.setEnabled(false);
                break;
            case R.id.bButton :
                letter = "b";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.bButton);
                button.setEnabled(false);
                break;
            case R.id.cButton :
                letter = "c";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.cButton);
                button.setEnabled(false);
                break;
            case R.id.dButton :
                letter = "d";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.dButton);
                button.setEnabled(false);
                break;
            case R.id.eButton :
                letter = "e";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.eButton);
                button.setEnabled(false);
                break;
            case R.id.fButton :
                letter = "f";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.fButton);
                button.setEnabled(false);
                break;
            case R.id.gButton :
                letter = "g";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.gButton);
                button.setEnabled(false);
                break;
            case R.id.hButton :
                letter = "h";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.hButton);
                button.setEnabled(false);
                break;
            case R.id.iButton :
                letter = "i";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.iButton);
                button.setEnabled(false);
                break;
            case R.id.jButton :
                letter = "j";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.jButton);
                button.setEnabled(false);
                break;
            case R.id.kButton :
                letter = "k";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.kButton);
                button.setEnabled(false);
                break;
            case R.id.lButton :
                letter = "l";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.lButton);
                button.setEnabled(false);
                break;
            case R.id.mButton :
                letter = "m";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.mButton);
                button.setEnabled(false);
                break;
            case R.id.nButton :
                letter = "n";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.nButton);
                button.setEnabled(false);
                break;
            case R.id.oButton :
                letter = "o";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.oButton);
                button.setEnabled(false);
                break;
            case R.id.pButton :
                letter = "p";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.pButton);
                button.setEnabled(false);
                break;
            case R.id.qButton :
                letter = "q";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.qButton);
                button.setEnabled(false);
                break;
            case R.id.rButton :
                letter = "r";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.rButton);
                button.setEnabled(false);
                break;
            case R.id.sButton :
                letter = "s";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.sButton);
                button.setEnabled(false);
                break;
            case R.id.tButton :
                letter = "t";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.tButton);
                button.setEnabled(false);
                break;
            case R.id.uButton :
                letter = "u";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.uButton);
                button.setEnabled(false);
                break;
            case R.id.vButton :
                letter = "v";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.vButton);
                button.setEnabled(false);
                break;
            case R.id.xButton :
                letter = "x";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.xButton);
                button.setEnabled(false);
                break;
            case R.id.yButton :
                letter = "y";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.yButton);
                button.setEnabled(false);
                break;
            case R.id.zButton :
                letter = "z";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.zButton);
                button.setEnabled(false);
                break;
            case R.id.æButton :
                letter = "æ";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.æButton);
                button.setEnabled(false);
                break;
            case R.id.øButton :
                letter = "ø";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.øButton);
                button.setEnabled(false);
                break;
            case R.id.åButton :
                letter = "å";
                galgelogik.gætBogstav(letter);
                updateUI(letter);
                showClickedOnLetterDialog(letter);
                button = (Button) findViewById(R.id.åButton);
                button.setEnabled(false);
                break;
        }
    }

    private void updateUI (String letter) {
        if (galgelogik.erSidsteBogstavKorrekt()) {
            updateVisibleWord();
        }
        else {
            updateImage();
            updateWrongCounter();
            showClickedOnLetterDialog(letter);
        }

        if (galgelogik.erSpilletSlut())
            showGameDoneDialog();
    }

    private void updateVisibleWord () {
        TextView visibleWord = (TextView) findViewById(R.id.visibleWord);
        visibleWord.setText(galgelogik.getSynligtOrd());
    }

    private void updateImage () {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (galgelogik.getAntalForkerteBogstaver()) {
            case 1:
                imageView.setImageResource(R.drawable.forkert1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.forkert2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.forkert3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.forkert4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.forkert5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.forkert6);
                break;
        }
    }

    private void updateWrongCounter () {
        TextView amountWrongLetters = (TextView) findViewById(R.id.amountWrongLetters);
        amountWrongLetters.setText(String.valueOf(galgelogik.getAntalForkerteBogstaver()));
    }

    private void showClickedOnLetterDialog (String letter) {
        AlertDialog alertDialog = new AlertDialog.Builder(GameActivity.this).create();
        alertDialog.setTitle("Letter clicked");
        if (galgelogik.erSidsteBogstavKorrekt())
            alertDialog.setMessage("The letter '"+letter+"' matched the hidden word!");
        else
            alertDialog.setMessage("The letter '"+letter+"' did not match the hidden word. You now have"
                    +" "+galgelogik.getAntalForkerteBogstaver()+" wrong letters");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }


    private void showGameDoneDialog () {
        AlertDialog alertDialog = new AlertDialog.Builder(GameActivity.this).create();
        alertDialog.setTitle("GAME OVER");
        if(galgelogik.erSpilletVundet())
            alertDialog.setMessage("NICE YOU WON THE GAME! You used "+galgelogik.getAntalForkerteBogstaver()+" of letters to win.");
            //Save to highscores
        else
            alertDialog.setMessage("You lost the game, because you have 6 letters wrong. The word was "+galgelogik.getOrdet());
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        galgelogik.nulstil();
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
