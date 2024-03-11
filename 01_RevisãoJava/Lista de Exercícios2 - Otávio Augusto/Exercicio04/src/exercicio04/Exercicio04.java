/*
    4. Faça um programa que leia 10 números inteiros, armazene-os 
    em um vetor, solicite um valor de referência inteiro e:
    
    a. imprima os números do vetor que são maiores que o valor 
    referência
    b. retorne quantos números armazenados no vetor são menores 
    que o valor de referência
    c. retorne quantas vezes o valor de referência aparece no 
    vetor
*/
package exercicio04;

import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v[] = new int[10];
        int j = 1, ref = 0, qtdMenores = 0, qtdRef = 0;
        
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite o %do valor: ", j++);
            v[i] = scan.nextInt();
        }
        System.out.printf("Valor de Referencia: ");
        ref = scan.nextInt();
        
        System.out.println("================================================");
        System.out.printf("Numeros maiores que o valor de referencia: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] > ref) {
                System.out.printf("%d ", v[i]);
            }
            if (v[i] < ref) {
                qtdMenores++;
            }
            if (v[i] == ref) {
                qtdRef++;
            }
        }
        System.out.printf("\nQuantidade de numeros menores que o valor de referencia: %d\n", qtdMenores);
        System.out.printf("Quantidade de vezes que o valor de referencia aparece: %d\n", qtdRef);
        System.out.println("================================================");
    }
    
}