package com.example.telasusuario;

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

    public void logar(View view) {
        EditText editUsuario = findViewById(R.id.edUsuario);
        EditText editSenha = findViewById(R.id.edSenha);

        String usuario = editUsuario.getText().toString();
        String senha = editSenha.getText().toString();

        if (this.autenticacao.autenticar(usuario, senha)) {
            startActivity(new Intent(this, MenuActivity.class));
        } else {
            Toast.makeText(this, "Login e/ou senha inválidos!", Toast.LENGTH_LONG).show();
        }
    }
}