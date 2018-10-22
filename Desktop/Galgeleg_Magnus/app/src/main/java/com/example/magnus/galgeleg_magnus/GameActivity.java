package com.example.magnus.galgeleg_magnus;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private Galgelogik galgelogik = new Galgelogik();
    private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,y,z,æ,ø,å;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        galgelogik.nulstil();

        a = (Button) findViewById(R.id.aButton);
        a.setOnClickListener(this);
        b = (Button) findViewById(R.id.bButton);
        b.setOnClickListener(this);
        c = (Button) findViewById(R.id.cButton);
        c.setOnClickListener(this);
        d= (Button) findViewById(R.id.dButton);
        d.setOnClickListener(this);
        e = (Button) findViewById(R.id.eButton);
        e.setOnClickListener(this);
        f = (Button) findViewById(R.id.fButton);
        f.setOnClickListener(this);
        g = (Button) findViewById(R.id.gButton);
        g.setOnClickListener(this);
        h = (Button) findViewById(R.id.hButton);
        h.setOnClickListener(this);
        i = (Button) findViewById(R.id.iButton);
        i.setOnClickListener(this);
        j = (Button) findViewById(R.id.jButton);
        j.setOnClickListener(this);
        k = (Button) findViewById(R.id.kButton);
        k.setOnClickListener(this);
        l = (Button) findViewById(R.id.lButton);
        l.setOnClickListener(this);
        m = (Button) findViewById(R.id.mButton);
        m.setOnClickListener(this);
        n = (Button) findViewById(R.id.nButton);
        n.setOnClickListener(this);
        o = (Button) findViewById(R.id.oButton);
        o.setOnClickListener(this);
        p = (Button) findViewById(R.id.pButton);
        p.setOnClickListener(this);
        q = (Button) findViewById(R.id.qButton);
        q.setOnClickListener(this);
        r = (Button) findViewById(R.id.rButton);
        r.setOnClickListener(this);
        s = (Button) findViewById(R.id.sButton);
        s.setOnClickListener(this);
        t = (Button) findViewById(R.id.tButton);
        t.setOnClickListener(this);
        u = (Button) findViewById(R.id.uButton);
        u.setOnClickListener(this);
        v = (Button) findViewById(R.id.vButton);
        v.setOnClickListener(this);
        x = (Button) findViewById(R.id.xButton);
        x.setOnClickListener(this);
        y = (Button) findViewById(R.id.yButton);
        y.setOnClickListener(this);
        z = (Button) findViewById(R.id.zButton);
        z.setOnClickListener(this);
        æ = (Button) findViewById(R.id.æButton);
        æ.setOnClickListener(this);
        ø = (Button) findViewById(R.id.øButton);
        ø.setOnClickListener(this);
        å = (Button) findViewById(R.id.åButton);
        å.setOnClickListener(this);

        TextView visibleWord = (TextView) findViewById(R.id.visibleWord);
        visibleWord.setText(galgelogik.getSynligtOrd());
    }

    @Override
    public void onClick(View view) {
        Button button = null;
        switch (view.getId()) {
            case R.id.aButton :
                letterClicked("a");
                button = (Button) findViewById(R.id.aButton);
                button.setEnabled(false);
                break;
            case R.id.bButton :
                letterClicked("b");
                button = (Button) findViewById(R.id.bButton);
                button.setEnabled(false);
                break;
            case R.id.cButton :
                letterClicked("c");
                button = (Button) findViewById(R.id.cButton);
                button.setEnabled(false);
                break;
            case R.id.dButton :
                letterClicked("d");
                button = (Button) findViewById(R.id.dButton);
                button.setEnabled(false);
                break;
            case R.id.eButton :
                letterClicked("e");
                button = (Button) findViewById(R.id.eButton);
                button.setEnabled(false);
                break;
            case R.id.fButton :
                letterClicked("f");
                button = (Button) findViewById(R.id.fButton);
                button.setEnabled(false);
                break;
            case R.id.gButton :
                letterClicked("g");
                button = (Button) findViewById(R.id.gButton);
                button.setEnabled(false);
                break;
            case R.id.hButton :
                letterClicked("h");
                button = (Button) findViewById(R.id.hButton);
                button.setEnabled(false);
                break;
            case R.id.iButton :
                letterClicked("i");
                button = (Button) findViewById(R.id.iButton);
                button.setEnabled(false);
                break;
            case R.id.jButton :
                letterClicked("j");
                button = (Button) findViewById(R.id.jButton);
                button.setEnabled(false);
                break;
            case R.id.kButton :
                letterClicked("k");
                button = (Button) findViewById(R.id.kButton);
                button.setEnabled(false);
                break;
            case R.id.lButton :
                letterClicked("l");
                button = (Button) findViewById(R.id.lButton);
                button.setEnabled(false);
                break;
            case R.id.mButton :
                letterClicked("m");
                button = (Button) findViewById(R.id.mButton);
                button.setEnabled(false);
                break;
            case R.id.nButton :
                letterClicked("n");
                button = (Button) findViewById(R.id.nButton);
                button.setEnabled(false);
                break;
            case R.id.oButton :
                letterClicked("o");
                button = (Button) findViewById(R.id.oButton);
                button.setEnabled(false);
                break;
            case R.id.pButton :
                letterClicked("p");
                button = (Button) findViewById(R.id.pButton);
                button.setEnabled(false);
                break;
            case R.id.qButton :
                letterClicked("q");
                button = (Button) findViewById(R.id.qButton);
                button.setEnabled(false);
                break;
            case R.id.rButton :
                letterClicked("r");
                button = (Button) findViewById(R.id.rButton);
                button.setEnabled(false);
                break;
            case R.id.sButton :
                letterClicked("s");
                button = (Button) findViewById(R.id.sButton);
                button.setEnabled(false);
                break;
            case R.id.tButton :
                letterClicked("t");
                button = (Button) findViewById(R.id.tButton);
                button.setEnabled(false);
                break;
            case R.id.uButton :
                letterClicked("u");
                button = (Button) findViewById(R.id.uButton);
                button.setEnabled(false);
                break;
            case R.id.vButton :
                letterClicked("v");
                button = (Button) findViewById(R.id.vButton);
                button.setEnabled(false);
                break;
            case R.id.xButton :
                letterClicked("x");
                button = (Button) findViewById(R.id.xButton);
                button.setEnabled(false);
                break;
            case R.id.yButton :
                letterClicked("y");
                button = (Button) findViewById(R.id.yButton);
                button.setEnabled(false);
                break;
            case R.id.zButton :
                letterClicked("z");
                button = (Button) findViewById(R.id.zButton);
                button.setEnabled(false);
                break;
            case R.id.æButton :
                letterClicked("æ");
                button = (Button) findViewById(R.id.æButton);
                button.setEnabled(false);
                break;
            case R.id.øButton :
                letterClicked("ø");
                button = (Button) findViewById(R.id.øButton);
                button.setEnabled(false);
                break;
            case R.id.åButton :
                letterClicked("å");
                button = (Button) findViewById(R.id.åButton);
                button.setEnabled(false);
                break;
        }
    }

    private void letterClicked (String letter) {
        galgelogik.gætBogstav(letter);
        updateUI(letter);
        showClickedOnLetterDialog(letter);
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
