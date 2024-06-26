package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void entrarVendas(View view) {
        startActivity(new Intent(this, VendasActivity.class));
    }

    public void entrarInstituicoes(View view) {
        startActivity(new Intent(this, InstituicoesActivity.class));
    }
}