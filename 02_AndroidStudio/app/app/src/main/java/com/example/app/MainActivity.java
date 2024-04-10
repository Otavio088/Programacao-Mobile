package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregarSpinerEstado();

        RadioGroup groupPeriodo = findViewById(R.id.radioGroupPeriodo);

        groupPeriodo.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int radioIdSelecionado) {
                        RadioButton radioSelecionado = findViewById(radioIdSelecionado);

                        Toast.makeText(MainActivity.this,
                                radioSelecionado.getText(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void acao(View view) {
        Switch opcao = findViewById(R.id.opcaoid);

        Toast.makeText(this,
                String.valueOf(opcao.isChecked()),
                Toast.LENGTH_SHORT).show();
    }

    public void selecionarEstado(View view) {
        Spinner spinnerEstado = findViewById(R.id.spinnerEstado);

        String estadoSelecionado = spinnerEstado.getSelectedItem().toString();

        Toast.makeText(this, estadoSelecionado, Toast.LENGTH_SHORT).show();
    }

    private void carregarSpinerEstado() {
        List<String> estados = new ArrayList<>();

        estados.add("SP");
        estados.add("MG");
        estados.add("RJ");

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                estados);

        Spinner spinner = findViewById(R.id.spinnerEstado);
        spinner.setAdapter(adapter);
    }

    public void checkCursos(View view) {
        CheckBox checkADS = findViewById(R.id.chkADS);
        CheckBox checkGE = findViewById(R.id.chkGE);

        String cursoSelecionado = "";

        if (checkADS.isChecked()) {
            cursoSelecionado += "ADS";
        }
        if (checkGE.isChecked()) {
            cursoSelecionado += "GE";
        }

        Toast.makeText(this, cursoSelecionado, Toast.LENGTH_SHORT).show();
    }

    public void radioPeriodoSelecionado(View view) {
        RadioGroup groupRadioPeriodo = findViewById(R.id.radioGroupPeriodo);

        int idRadioSelecionado = groupRadioPeriodo.getCheckedRadioButtonId();

        RadioButton periodoSelecionado = findViewById(idRadioSelecionado);

        Toast.makeText(this, periodoSelecionado.getText(),
                Toast.LENGTH_SHORT).show();
    }

}