package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EntradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        carregarSpiners();

    }

    public void mostrarResultados(View view) {
        Spinner spinnerDisciplinas = findViewById(R.id.edSpinnerDisciplinas);
        String disciplinaSelecionada = spinnerDisciplinas.getSelectedItem().toString();

        Spinner spinnerPeriodos = findViewById(R.id.edSpinnerPeriodos);
        String periodoSelecionado = spinnerPeriodos.getSelectedItem().toString();

        TextView resultados = (TextView) findViewById(R.id.edTxtResultados);

        double media = 0;
        EditText edAv1 = findViewById(R.id.edTxtAv1);
        EditText edAv2 = findViewById(R.id.edTxtAv2);
        EditText edAv3 = findViewById(R.id.edTxtAv3);

        Double av1 = Double.parseDouble(edAv1.getText().toString());
        Double av2 = Double.parseDouble(edAv2.getText().toString());
        Double av3 = Double.parseDouble(edAv3.getText().toString());

        String resultado = null;

        if (periodoSelecionado.equals("Noturno")) {
            media = (av1 * 3 + av2 * 4 + av3 * 3) / 10;
            if (media >= 6) {
                resultado = "Aprovado";
            } else {
                resultado = "Reprovado";
            }
        } else {
            media = (av1 + av2 + av3) / 3;
            if (media >= 7) {
                resultado = "Aprovado";
            } else {
                resultado = "Reprovado";
            }
        }

        resultados.setText("Disciplina: " + disciplinaSelecionada + "\n"
                + "Período: " + periodoSelecionado + "\n"
                + "Média: " + media + "\n"
                + "Resultado: " + resultado);

        edAv1.setText(null);
        edAv2.setText(null);
        edAv3.setText(null);
        spinnerDisciplinas.setSelection(0);
        spinnerDisciplinas.setSelection(0);
    }

    private void carregarSpiners() {
        List<String> materias = new ArrayList<>();
        materias.add("Matemática");
        materias.add("História");
        materias.add("Informática");
        materias.add("Geografia");
        materias.add("Português");

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                materias);
        Spinner spinner = findViewById(R.id.edSpinnerDisciplinas);
        spinner.setAdapter(adapter);

        List<String> periodos = new ArrayList<>();
        periodos.add("Diurno");
        periodos.add("Noturno");
        periodos.add("Matutino");
        periodos.add("Vespertino");

        ArrayAdapter adapter1 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                periodos);
        Spinner spinner1 = findViewById(R.id.edSpinnerPeriodos);
        spinner1.setAdapter(adapter1);
    }
}