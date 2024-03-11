/*
    5. Ler dois conjuntos de números reais, armazenando-os em 
    vetores e calcular o produto escalar entre eles. Os conjuntos 
    tem 5 elementos cada. Imprimir os dois conjuntos e o produto 
    escalar, sendo que o produto escalar e dado por: x1 ∗ y1 + x2 
    ∗ y2 + ... + xn ∗ yn.

 */
package exercicio05;

import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A[] = new double[5], B[] = new double[5];
        double prodEscalar = 0;
        
        System.out.println("------------PREENCHA OS CONJUNTOS------------");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Valor de A[%d]: ", i);
            A[i] = scan.nextDouble();
            System.out.printf("Valor de B[%d]: ", i);
            B[i] = scan.nextDouble();
            
            prodEscalar += (A[i] * B[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Primeiro Conjunto(A)\tSegundo Conjunto(B)");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%.2f\t\t\t%.2f\n", A[i], B[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("Produto Escalar: %.2f\n", prodEscalar);
        System.out.println("---------------------------------------------");
    }
    
}