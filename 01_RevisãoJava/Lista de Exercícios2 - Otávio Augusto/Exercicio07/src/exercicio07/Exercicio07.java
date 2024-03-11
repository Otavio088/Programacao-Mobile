/*
    7. Leia dois vetores de inteiros x e y, cada um com 5 elementos 
    (assuma que o usuário informa elementos repetidos). Calcule e 
    mostre os vetores resultantes em cada caso abaixo:

    a. Soma entre x e y: soma de cada elemento de x com o elemento 
    da mesma posição em y.
    b. Produto entre x e y: multiplicação o de cada elemento de x 
    com o elemento da mesma posição em y.
    c. Diferença entre x e y: todos os elementos de x que não 
    existam em y.
    d. Intersecção entre x e y: apenas os elementos que aparecem 
    nos dois vetores.
    e. União entre x e y: todos os elementos de x, e todos os 
    elementos de y que não estão o em x.
*/
package exercicio07;

import java.util.Scanner;
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[5], y[] = new int[5];
        int i, j, cont;
        
        System.out.println("---------------------------------------------");
        System.out.println("--------PREENCHA OS SEGUINTES VETORES--------");
        System.out.println("---------------------------------------------");
        for (i = 0; i < x.length; i++) {
            System.out.printf("Valor Inteiro para x[%d]: ", i);
            x[i] = scan.nextInt();
        }
        System.out.println("---------------------------------------------");
        for (i = 0; i < y.length; i++) {
            System.out.printf("Valor Inteiro para y[%d]: ", i);
            y[i] = scan.nextInt();
        }
        System.out.println("---------------------------------------------");
        
        System.out.printf("a. Soma de x com elementos da mesma posicao em y: ");
        for (i = 0; i < x.length; i++) {
            System.out.printf("%d ", (x[i]+y[i])) ;
        }
        
        System.out.printf("\nb. Multiplicacao de x com o elementos da mesma posicao em y: ");
        for (i = 0; i < x.length; i++) {
            System.out.printf("%d ", (x[i]*y[i])) ;
        }
        
        System.out.printf("\nc. Todos os elementos de x que nao existem em y: ");
        for (i = 0; i < x.length; i++) {
            cont = 0;
            for (j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    cont++;
                    break;
                }
            }
            if (cont == 0) {
                System.out.printf("%d ", x[i]);
            }
        }
        
        System.out.printf("\nd. Elementos que aparecem nos dois vetores: ");
        for (i = 0; i < x.length; i++) {
            cont = 0;
            for (j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    cont++;
                    break;
                }
            }
            if (cont == 1) {
                System.out.printf("%d ", x[i]);
            }
        }
        
        System.out.printf("\ne. Todos os elementos de x e todos de y que nao estao o em x: ");
        for (i = 0; i < x.length; i++) {
                System.out.printf("%d ", x[i]);
        }
        for (i = 0; i < y.length; i++) {
            cont = 0;
            for (j = 0; j < x.length; j++) {
                if (y[i] == x[j]) {
                    cont++;
                    break;
                }
            }
            if (cont == 0) {
                System.out.printf("%d ", y[i]);
            }
        }
        System.out.println("\n---------------------------------------------");
    }
    
}