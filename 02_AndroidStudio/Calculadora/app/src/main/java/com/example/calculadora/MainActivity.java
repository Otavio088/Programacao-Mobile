package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double valorInicial;
    private String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numeroUm(View view) {
        atribuirDisplay("1");
    }

    public void numeroDois(View view) {
        atribuirDisplay("2");
    }

    public void numeroTres(View view) {
        atribuirDisplay("3");
    }

    public void numeroQuatro(View view) {
        atribuirDisplay("4");
    }

    public void numeroCinco(View view) {
        atribuirDisplay("5");
    }

    public void numeroSeis(View view) {
        atribuirDisplay("6");
    }

    public void numeroSete(View view) {
        atribuirDisplay("7");
    }

    public void numeroOito(View view) {
        atribuirDisplay("8");
    }

    public void numeroNove(View view) {
        atribuirDisplay("9");
    }

    public void numeroZero(View view) {
        atribuirDisplay("0");
    }

    public void sinalSoma(View view) {
        TextView display = findViewById(R.id.viewDisplay);

        valorInicial = Double.parseDouble(display.getText().toString());
        operacao = "soma";

        display.setText("");
    }

    public void sinalMenos(View view) {
        TextView display = findViewById(R.id.viewDisplay);

        valorInicial = Double.parseDouble(display.getText().toString());
        operacao = "subtracao";

        display.setText("");
    }

    public void sinalMuitiplicacao(View view) {
        TextView display = findViewById(R.id.viewDisplay);

        valorInicial = Double.parseDouble(display.getText().toString());
        operacao = "multiplicacao";

        display.setText("");
    }

    public void sinalDivisao(View view) {
        TextView display = findViewById(R.id.viewDisplay);

        valorInicial = Double.parseDouble(display.getText().toString());
        operacao = "divisao";

        display.setText("");
    }

    private void atribuirDisplay(String valor) {
        TextView display = findViewById(R.id.viewDisplay);

        String text = display.getText().toString();

        //concatenando string
        display.setText(text + valor);

    }

    public void calcular(View view) {
        TextView display = findViewById(R.id.viewDisplay);

        Double valorAtual = Double.parseDouble(display.getText().toString());

        Double resultado = 0.0;

        if (operacao.equals("soma")) {
            resultado = valorInicial + valorAtual;
        }
        if (operacao.equals("subtracao")) {
            resultado = valorInicial - valorAtual;
        }
        if (operacao.equals("multiplicacao")) {
            resultado = valorInicial * valorAtual;
        }
        if (operacao.equals("divisao")) {
            resultado = valorInicial / valorAtual;
        }

        display.setText(resultado.toString());
    }
}