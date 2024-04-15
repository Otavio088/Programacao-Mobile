package com.example.telacursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregarSpinerCurso();

        RadioGroup groupPagamento = findViewById(R.id.radioGroupPagamento);

        groupPagamento.setOnCheckedChangeListener( //função anônima
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int radioIdSelecionado) {
                        RadioButton radioSelecionado = findViewById(radioIdSelecionado);

                        TextView pagamentoMes = (TextView) findViewById(R.id.txtMes);
                        TextView pagamentoAno = (TextView) findViewById(R.id.txtAno);

                        double resultadoMes = 0;
                        double resultadoAno = 0;

                        if (radioSelecionado.getText().equals("A vista")) {
                            resultadoAno = acumulo;
                            resultadoMes = acumulo;
                        }
                        if (radioSelecionado.getText().equals("Parcelado")) {
                            resultadoMes = (acumulo + (0.035 * acumulo))/12;
                            resultadoAno = resultadoMes*12;
                        }

                        pagamentoMes.setText(String.valueOf(resultadoMes));
                        pagamentoAno.setText(String.valueOf(resultadoAno));
                    }
                }
        );

    }

    double acumulo = 0;

    public void adicionarCurso(View view) {
        Spinner spinnerCurso = findViewById(R.id.spinnerCursos);

        String cursoSelecionado = spinnerCurso.getSelectedItem().toString();

        TextView curso = (TextView) findViewById(R.id.txtMostraCursos);
        
        String cursoEscolhido = null;

        double valor = 0;

        if (cursoSelecionado.equals("Design")) {
            cursoEscolhido = "Design - 950,00";
            valor = 950;
        }
        if (cursoSelecionado.equals("Moda")) {
            cursoEscolhido = "Moda - 680,00";
            valor = 680;
        }
        if (cursoSelecionado.equals("Adm")) {
            cursoEscolhido = "Adm - 720,00";
            valor = 720;
        }
        if (cursoSelecionado.equals("ADS")) {
            cursoEscolhido = "ADS - 840,00";
            valor = 840;
        }
        
        curso.setText(cursoEscolhido);

        acumulo += valor;
    }

    List<String> cursos = new ArrayList<>();
    private void carregarSpinerCurso() {

        cursos.add("Design");
        cursos.add("Moda");
        cursos.add("Adm");
        cursos.add("ADS");


        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                cursos);

        Spinner spinner = findViewById(R.id.spinnerCursos);
        spinner.setAdapter(adapter);
    }

}