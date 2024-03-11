/*
    2. Faça um programa que leia dois conjuntos de números inteiros, 
    tendo cada um 10 elementos. Ao final o programa deve listar os 
    elementos comuns aos conjuntos.
 */

package exercicio02;

import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer v1[] = new Integer[10], v2[] = new Integer[10];
        int i, j;
        
        System.out.println("------------------------------");
        for(i = 0; i < 10; i++) {
            System.out.printf("Valor inteiro de v1[%d]: ", i);
            v1[i] = scan.nextInt();
        }
        
        System.out.println("------------------------------");
        for(i = 0; i < 10; i++) {
            System.out.printf("Valor inteiro de v2[%d]: ", i);
            v2[i] = scan.nextInt();
        }
        
        System.out.println("------------------------------");
        System.out.println("ELEMENTOS COMUNS AOS CONJUNTOS");
        System.out.println("------------------------------");
        for(i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (v1[i] == v2[j]) {
                    System.out.println(v1[i]);
                    break;
                }
            }
        }
        System.out.println("------------------------------");
    }
    
}