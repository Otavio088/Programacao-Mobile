/*
    08) Crie um programa que solicite ao usuario digitar uma sequencia
    de valores inteiros. Encerre a execução quando -1 for digitado;

    Ao final, mostre os numeros digitados e a quantidade de vezes que
    cada um foi informado.
*/
package exercicio08;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
        int n = 0, cont = 0;
        
        System.out.println("Digite uma sequencia de valores inteiros: ");
        do {
            n = scan.nextInt();
            
            cont = numeros.getOrDefault(n, 0);
            numeros.put(n, ++cont);
            
        } while (n != -1);

        System.out.println("Numeros: ");
        System.out.println("--------------------------------------");
        for (Entry<Integer, Integer> m : numeros.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
    
}
