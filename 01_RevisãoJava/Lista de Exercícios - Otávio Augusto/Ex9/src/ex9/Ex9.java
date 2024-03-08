/*
    9. As aplicações financeiras apresentam diversas modalidades cujos 
    rendimentos têm variações; os rendimentos do tipo renda fixa, são 
    indexados à taxa Selic. Dado a isso crie um programa que calcule o 
    rendimento em 12 meses, mês a mês, dada as possibilidades de 
    investimento abaixo e indique qual o mais vantajoso, considerando 
    os valores a serem informados taxa selic e o capital para aplicação:
    
    a. CDB Banco Pague Mais
     i. 85% da taxa selic
     ii. taxa administrativa 10% do rendimento
    b. CBD Fura Bolso
     i. 93% da taxa selic
     ii. taxa administrativa fixa de 1% sobre o capital;
     iii. 6% imposto sobre o rendimento;
    
    O programa deverá mostrar para cada investimento saída similar a:
    
    Taxa selic: x
    Capital investido:
    Mes     Capital     Rendimento     Total
    1       1000,00     100,00         1100,00
    2       1100,00     110,00         1210,00
    …
    Rendimento Total: xxxx
    Descontos: yyyyy
    Rendimento Líquido: zzzzz
*/
package ex9;

import java.util.Scanner;
public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cap = 0, rend = 0, rendTotal = 0, desconto = 0, rendLiquido = 0;
        double taxaSelic = 0, descontoAdm = 0;
        int op = 0;
        
        System.out.println("========================================");
        System.out.println("[1] - 85% CDB (Banco Pague Mais)");
        System.out.println("[2] - 93% CBD (Fura Bolso)");
        System.out.println("========================================");
        System.out.println("          APLICACAO RENDA FIXA          ");
        System.out.println("========================================");
        System.out.printf("Capital: ");
        cap = scan.nextDouble();
        do {
            System.out.printf("Opcao de taxa selic (1/2): ");
            op = scan.nextInt();
        } while ((op != 1) && (op != 2));
        
        System.out.println("========================================");
        System.out.printf("Mes\tCapital\t\tRendimento\tTotal\n");
        if (op == 1) {
            taxaSelic = 0.85;
            for (int i = 1; i <= 12; i++) {
                rend = (taxaSelic * cap);
                descontoAdm = (0.10 * rend);
                desconto += descontoAdm;
                rend -= descontoAdm;
                rendTotal += rend;    
                
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\n", i, cap, rend, cap+rend);
                cap += rend;
                rend = 0;
            }
        } else {
            taxaSelic = 0.93;
            for (int i = 1; i <= 12; i++) {
                rend = (taxaSelic * cap);
                descontoAdm = (0.01 * cap);
                double impostoRend = (0.06 * rend);
                desconto += (descontoAdm + impostoRend);
                rend -= (descontoAdm + impostoRend);
                rendTotal += rend;
                
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\n", i, cap, rend, cap+rend);
                cap += rend;
                rend = 0;
            }
        }
        
        desconto = (rendTotal - (0.85*rendTotal));
        rendLiquido = (rendTotal - desconto);
        System.out.printf("Rendimento Total: %.2f\n", rendTotal);
        System.out.printf("Descontos: %.2f\n", desconto);
        System.out.printf("Rendimento Liquido: %.2f\n", rendLiquido);
        System.out.println("========================================");
    }

}