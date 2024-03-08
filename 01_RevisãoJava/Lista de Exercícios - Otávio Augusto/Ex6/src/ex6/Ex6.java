/*
    6. Crie um programa que permita calcular o valor do salário 
    líquido de um funcionário considerando o desconto do INSS. 
    O desconto da contribuição do INSS é dado segundo a tabela:
    
    ----------------------------------------------------
    De            Até            Aliquota        Dedução
    ----------------------------------------------------
    0,00          1.212,00       7,50%           0,00
    1.212,01      2.427,35       9,00%           18,18   
    2.427,36      3.641,03       12,00%          91,00
    3.641,04      7.087,22       14,00%          163,82
    ----------------------------------------------------
    
    O cálculo do INSS é dado por:
    Valor INSS = (salário * % alíquota) - dedução.
    Solicite ao usuário informar o salário bruto e mostre a seguinte saída:
    
    ##########################
    CALCULADORA DE INSS
    ##########################
    Salário Bruto ....: 2000,00
    Alíquota INSS (%).: 7,5
    Desconto INSS ……..: 161,82
    Salário Líquido ..: 1838,18
    ###########################
*/
package ex6;

import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioBruto = 0.0, salarioLiquido = 0.0;
        double INSS = 0.0, aliquota = 0.0, deducao = 0.0;
        
        System.out.println("##########################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("##########################");
        System.out.printf("Salario Bruto.....: ");
        salarioBruto = scan.nextDouble();
        
        if ((salarioBruto >= 0) && (salarioBruto <= 1212.00)) {
            aliquota = 0.075;
            INSS = (salarioBruto * aliquota) - deducao;
        } else if ((salarioBruto >= 1212.01) && (salarioBruto <= 2427.35)) {
            aliquota = 0.09;
            deducao = 18.18;
            INSS = (salarioBruto * aliquota) - deducao;
        } else if ((salarioBruto >= 2427.36) && (salarioBruto <= 3641.03)) {
            aliquota = 0.12;
            deducao = 91.00;
            INSS = (salarioBruto * aliquota) - deducao;
        } else if ((salarioBruto >= 3641.04) && (salarioBruto <= 7087.22)) {
            aliquota = 0.14;
            deducao = 163.82;
            INSS = (salarioBruto * aliquota) - deducao;
        } else {
            System.out.println("Valor muito alto!");
            System.exit(0);
        }
        
        salarioLiquido = salarioBruto - INSS;
        
        System.out.printf("Aliquota INSS (%%).: %.2f\n", aliquota*100);
        System.out.printf("Desconto INSS ....: %.2f\n", INSS);
        System.out.printf("Salario Liquido ..: %.2f\n", salarioLiquido);
        System.out.println("##########################");
        
    }

}
