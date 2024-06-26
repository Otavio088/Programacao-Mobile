package com.example.p2;

public class Autenticacao {
    private static final String USUARIOADM = "admin";
    private static final String SENHAADM = "fatec123@";

    private static final String USUARIOALUNO = "aluno";
    private static final String SENHAALUNO = "aluno123@";

    public boolean entrarMenu(String usuario, String senha) {

        if (usuario.equals(USUARIOADM) && senha.equals(SENHAADM)) {
            return true;
        } else if (usuario.equals(USUARIOALUNO) && senha.equals(SENHAALUNO)) {
            return true;
        }

        return false;
    }
}
