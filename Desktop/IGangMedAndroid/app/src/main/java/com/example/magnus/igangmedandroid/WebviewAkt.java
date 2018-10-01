package com.example.magnus.igangmedandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class WebviewAkt extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Button okKnap = (Button) findViewById(R.id.OK);
        okKnap.setOnClickListener(this);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://javabog.dk");
    }

    @Override
    public void onClick(View view) {
        //Switch case håndtere de forskellige knapper og deres operationer
        switch (view.getId()) {
            case R.id.OK :
                skiftHjemmesideFunktion();
                break;
        }
    }

    public void skiftHjemmesideFunktion () {
        System.out.println("Der blev trykket");
        TextView hjemmesideTekstBoks = (TextView) findViewById(R.id.editText2);
        WebView webView = (WebView) findViewById(R.id.webView);
        String url = String.valueOf(hjemmesideTekstBoks.getText());
        webView.loadUrl(url);
    }
}
