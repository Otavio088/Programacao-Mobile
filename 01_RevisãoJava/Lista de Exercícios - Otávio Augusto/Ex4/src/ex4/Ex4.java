/*
    4. Crie um programa que receba um número inteiro n e leia n valores 
    do teclado e compute quantos destes valores são negativos.
*/

package ex4;

import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, v = 0, cont = 0;
        
        System.out.printf("Valor inteiro para n: ");
        n = scan.nextInt();
        System.out.println("-------------------------------");
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o %d valor: ", i);
            v = scan.nextInt();
            if (v < 0) {
                cont++;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Quantidade de valores negativos digitados: " + cont);
    }
    
}