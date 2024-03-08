/*
    05) Crie um programa que armazene todos os múltiplos de 6
    contidos entre -100 e 100;  
    
    Mostrar a quantidade de múltiplos encontrados e:
    a. a soma dos múltiplos;
    b. a média dos múltiplos;
    c. a listagem dos múltiplos;
*/
package exercicio05;

import java.util.List;
import java.util.ArrayList;
public class Exercicio05 {

    public static void main(String[] args) {
        List<Integer> listaMultiplos = new ArrayList<Integer>();
        int soma = 0, media = 0;
        
        for (int i = -100; i <= 100; i++) {
            if (i%6 == 0) {
                listaMultiplos.add(i);
            }
        }
        
        for (Integer n : listaMultiplos) {
            System.out.printf("%d\n", n);
            soma += n;
        }
        
        media = soma/200;
        
        System.out.println("--------------------------------");
        System.out.println("Quantidade de multiplos encontrados: " + listaMultiplos.size());
        System.out.println("Soma dos multiplos: " + soma);
        System.out.println("Media dos multiplos: " + media);
    }
    
}
