/*
    3. Construa um programa que leia dados para um vetor de 
    100 elementos inteiros. Imprimir o maior e o menor, sem 
    ordenar, o percentual de números pares e a média dos 
    elementos do vetor.
 */
package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        int v[] = new int[100];
        int maior = 0, menor = 0;
        double percPares = 0, media = 0;
        
        for (int i = 0; i < v.length; i++) {
            v[i] = preencherVetor();
            System.out.println(v[i]);
        }
        
        maior = v[0]; menor = v[0];
        
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i]%2 == 0) {
                percPares++;
            }
            media += v[i];
        }
        percPares = (percPares / v.length * 100);
        media /= v.length;
        
        System.out.println("===========================================");
        System.out.println("Maior Valor do Vetor: " + maior);
        System.out.println("Menor Valor do Vetor: " + menor);
        System.out.printf("Percentual de Valores Pares: %.2f%%\n", percPares);
        System.out.printf("Media dos elementos do Vetor: %.2f\n", media);
        System.out.println("===========================================");
    }
    
    public static int preencherVetor() {
        return (int) (Math.random() * 100);
    }
    
}