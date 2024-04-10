package com.example.telasusuario;

public class Autenticacao {

    private static final String USUARIO = "admin";
    private static final String SENHA = "fatec123";

    //metodo para autenticar usuario e senha estaticos:
    public boolean autenticar(String usuario, String senha) {

        if (usuario.equals(USUARIO) && senha.equals(SENHA)) {
            return true; //usuario validado
        }

        return false; //usuario invalidado
    }
}
