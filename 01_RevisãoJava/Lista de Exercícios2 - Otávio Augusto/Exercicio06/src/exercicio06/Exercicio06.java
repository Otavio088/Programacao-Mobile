/*
    6. Faça um programa que calcule o desvio padrão de um 
    vetor v contendo n = 10 números, onde m é a média do vetor.
                               n
    Desvio Padrão = √ (1/n-1)  Σ (v[i] - m)^2
                              i=1   
 */
package exercicio06;

public class Exercicio06 {

    public static void main(String[] args) {
        int v[] = new int[10], m = 0;
        double D = 0;
         
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
             
            m += v[i];
        }
         
        m /= v.length;
         
        for (int i = 0; i < v.length; i++) {
            D += Math.pow(v[i] - m, 2);
        }
        
        D = Math.sqrt(D/(v.length-1));
        
        System.out.printf("Desvio Padrao = %.2f\n", D);
    }
    
}