/*
    12. Faça uma função que receba por parâmetro dois valores 
    X e Z. Calcule e retorne o resultado de X^z para o programa 
    principal. Atenção não utilize nenhuma função pronta de
    exponenciação.
*/
package exercicio12;

import java.util.Scanner;
public class Exercicio12 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = 0, Z = 0;
        
        System.out.println("--------------------------------");
        System.out.printf("Valor de X: ");
        X = scan.nextInt();
        
        System.out.printf("Valor de Z: ");
        Z = scan.nextInt();
        System.out.println("--------------------------------");
        
        System.out.printf("%d^%d = %d\n", X, Z, calcularExponenciacao(X, Z));
    }
    
    public static int calcularExponenciacao(int X, int Z) {   
        int exp = 1;
        
        for (int i = 0; i < Z; i++) {
            exp *= X;
        }
        
        return exp;
    }
    
}
