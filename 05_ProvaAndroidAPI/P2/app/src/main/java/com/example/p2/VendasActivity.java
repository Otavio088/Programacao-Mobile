package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class VendasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas);
    }

    public void calcularVendas(View view) {
        CheckBox checkTeclado = findViewById(R.id.idCheckTeclado);
        CheckBox checkViolao = findViewById(R.id.idCheckViolao);
        CheckBox checkViolino = findViewById(R.id.idCheckViolino);
        CheckBox checkGuitarra = findViewById(R.id.idCheckGuitarra);

        int qtdItens = 0;
        Double totalItens = 0.0;

        TextView resultados = (TextView) findViewById(R.id.idTxtResultado);

        if (checkTeclado.isChecked()) {
            totalItens += 1850.00;
            qtdItens++;
        }
        if (checkViolao.isChecked()) {
            totalItens += 800.00;
            qtdItens++;
        }
        if(checkViolino.isChecked()) {
            totalItens += 450.50;
            qtdItens++;
        }
        if(checkGuitarra.isChecked()) {
            totalItens += 1500.00;
            qtdItens++;
        }

        if (qtdItens == 0) {
            resultados.setText("Nenhum produto selecionado!");
        } else {
            resultados.setText("Total dos Valores: " + totalItens + "\n" +
                    "Quantidade de Itens Selecionados: " + qtdItens);
        }
    }

    public void voltarMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

}