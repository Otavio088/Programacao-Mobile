package com.example.ex1;

public class Autenticacao {

    private static final String USUARIO = "professor";
    private static final String SENHA = "fatec";

    public boolean autenticar(String usuario, String senha) {

        if (usuario.equals(USUARIO) && senha.equals(SENHA)) {
            return true;
        }

        return false;
    }

}