package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Autenticacao autenticacao = new Autenticacao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view) {
        EditText editTxtUsuario = findViewById(R.id.idTxtUsuario);
        EditText editTxtSenha = findViewById(R.id.idTxtSenha);

        String usuario = editTxtUsuario.getText().toString();
        String senha = editTxtSenha.getText().toString();
        if(autenticacao.entrarMenu(usuario, senha)){
            startActivity(new Intent(this, MenuActivity.class));
        }else{
            Toast.makeText(this, "Login ou senha Invalidos!", Toast.LENGTH_LONG).show();
        }
    }
}