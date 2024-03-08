/*
    06) Solicite ao usuário digitar uma sequência de números:
    
    Esses números deverão ser armazenados em uma lista;
    
    No entanto, não serão admitidos números repetidos na lista;
    
    Quando o usuário digitar -1 interrompa a execução e determine:
    a. quantos números foram digitados que já existiam;
    b. quais são esses números.
*/
package exercicio06;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();
        List<Integer> listaRepetidos = new ArrayList<Integer>();
    
        int i = 0;
        Integer aux = 0;
        do {
            System.out.printf("Digite um numero inteiro(ou -1 para parar): ");
            aux = scan.nextInt();
                
            if (testarRepetidos(listaNumeros, aux)) {
                listaRepetidos.add(aux);
            } else {
                listaNumeros.add(aux);
            }
            
            i++;
        }while (aux != -1);
        
        System.out.println("--------------------------------------------");
        System.out.println("a. Quantidade de numeros digitados que ja existem: " + listaRepetidos.size());
        System.out.printf("b. Os numeros digitados: ");
        for (Integer n : listaRepetidos) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n--------------------------------------------");
    }
    
    public static boolean testarRepetidos(List<Integer> listaNumeros, int n) {
        for (Integer i : listaNumeros) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }
    
}