/*
    14. Escreva uma função que gera um triângulo de altura e 
    lados n e base 2*n-1. Por exemplo, a saída para n = 6 seria:
            *
           ***
          *****
         *******
        *********
       ***********
*/
package exercicio14;

import java.util.Scanner;
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        System.out.printf("Digite um numero: ");
        n = scan.nextInt();
        System.out.println("---------------------------");
        
        gerarTriangulo(n);
    }
    
    public static void gerarTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < (2*i-1); j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    
}

