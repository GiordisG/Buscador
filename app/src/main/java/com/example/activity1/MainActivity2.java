package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    Button btn_finalizar;
    Bundle bn;
    String datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bn = getIntent().getExtras();
        datos =  bn.getString("pagina");
        webView = findViewById(R.id.webView);
        webView.loadUrl("https://"+datos);
        btn_finalizar = findViewById(R.id.button_finalizar);
        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}