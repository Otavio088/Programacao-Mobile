/*
    10. Faça uma função e um programa de teste para o cálculo 
    do volume de uma esfera. Sendo que o raio é passado por 
    parâmetro. V = 4/3∗π∗R^3
*/
package exercicio10;

import java.util.Scanner;
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double R = 0;
        
        System.out.printf("Digite o Raio: ");
        R = scan.nextDouble();
        
        double V = calcularVolumeEsfera(R);
        
        System.out.println("-----------------------------------");
        System.out.printf("Volume da esfera: %.2f\n", V);
        System.out.println("-----------------------------------");
    }
    
    public static double calcularVolumeEsfera(double R) {
        return ((4.0/3.0) * Math.PI * Math.pow(R, 3));
    }
    
}