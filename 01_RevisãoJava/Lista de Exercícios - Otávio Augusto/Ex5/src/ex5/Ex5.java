/*
    5. Crie um programa que receba um valor inteiro informado pelo usuário 
    e determine se esse valor é um número primo. Observe que os números 
    primos são aqueles que são divisíveis apenas por eles próprios e por 1.
*/
package ex5;

import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, cont = 0;
        
        System.out.printf("Digite um valor inteiro: ");
        n = scan.nextInt();
        
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                cont++;
                break;
            }
        }
        
        if (cont == 1) {
            System.out.println("Nao eh um numero primo!");
        } else {
            System.out.println("Eh um numero primo!");
        }
    }
    
}