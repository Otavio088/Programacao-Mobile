/*
    13. Crie uma função que receba como parâmetro um valor 
    inteiro e gere como saída n linhas com pontos de exclamação 
    conforme o exemplo abaixo (para n = 5):
    !
    !!
    !!!
    !!!!
    !!!!!
*/
package exercicio13;

import java.util.Scanner;
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        System.out.printf("Digite um numero: ");
        n = scan.nextInt();
        System.out.println("---------------------------");
        
        gerarExclamacao(n);
    }
    
    public static void gerarExclamacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("! ");
            }
            System.out.println("");
        }
    }
    
}