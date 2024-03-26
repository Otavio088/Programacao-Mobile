package com.example.mobile_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensagemBotao(View view) {
        EditText edNome = findViewById(R.id.edNome);

        Toast.makeText(this, edNome.getText() + " FATEC Mococa", Toast.LENGTH_LONG).show();
    }

    public void somaBotao(View view) {
        EditText edNum1 = findViewById(R.id.edN1);
        EditText edNum2 = findViewById(R.id.edN2);

        Integer n1 = Integer.parseInt(edNum1.getText().toString());
        Integer n2 = Integer.parseInt(edNum2.getText().toString());

        Toast.makeText(this, "A soma é: " + (n1 + n2), Toast.LENGTH_LONG).show();
    }
}