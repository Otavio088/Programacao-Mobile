/*
    07) Crie uma classe chamada Aluno com os atributos ra, nome e cidade;
    
    Solicite ao usuario digitar os dados de 5 alunos e armazene-os numa lista;

    Valide o RA e o Nome para nao existir alunos iguais.

*/
package exercicio07;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        System.out.println("-----------------------------");
        for (int i = 0; i < 5; i++) {
            Aluno novoAluno = new Aluno();
            
            System.out.printf("RA do aluno: ");
            novoAluno.ra = scan.nextInt();
            System.out.printf("Nome do Aluno: ");
            novoAluno.nome = scan.next();
            System.out.printf("Cidade do Aluno: ");
            novoAluno.cidade = scan.next();

                if (listaAlunos.contains(novoAluno)) {
                    System.out.println("Ja existe!");
                } else {
                    listaAlunos.add(novoAluno);
                }
            System.out.println("-----------------------------");
        }
        
    }
    
}
