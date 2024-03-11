/*
    11. Faça uma função que receba 3 números inteiros como 
    parâmetro, representando horas, minutos e segundos, e 
    os converta em segundos.
*/
package exercicio11;

import java.util.Scanner;
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hr = 0, min = 0, seg = 0;
        
        System.out.println("---------------------------");
        System.out.printf("Digite as horas: ");
        hr = scan.nextInt();
        
        System.out.printf("Digite os minutos: ");
        min = scan.nextInt();
        
        System.out.printf("Digite os segundos: ");
        seg = scan.nextInt();
        System.out.println("---------------------------");
        
        System.out.println("Convertido em segundos: " + converterSegundos(seg, min, hr));
    }
    
    public static int converterSegundos(int s, int m, int h) {
        return (s + (m*60) + (h*3600));
    }
    
}