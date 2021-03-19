package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_buscar;
    EditText txt_buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_buscar = findViewById(R.id.buscador);
        btn_buscar = findViewById(R.id.button_buscar);

    }
    public void sendPage(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("pagina", txt_buscar.getText().toString());
        startActivity(intent);
    }
}