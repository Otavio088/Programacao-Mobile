/*
    1. Construa um programa que armazene o código, a quantidade, o 
    valor de compra e o valor de venda de 30 produtos. A listagem 
    pode ser de todos os produtos ou somente de um ao se digitar o 
    código.
*/

package exercicio01;

import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto[] = new Produto[30];
        int i;
        
        System.out.println("===========================");
        System.out.println("     LISTAGEM PRODUTOS     ");
        System.out.println("===========================");
        for (i = 0; i < 30; i++) {
            produto[i] = preencherProduto();
            
            System.out.println("Codigo: " + produto[i].codigo);
            System.out.println("Quantidade: " + produto[i].quantidade);
            System.out.printf("Valor de Compra: %.2f\n", produto[i].valorCompra);
            System.out.printf("Valor de Venda: %.2f\n", produto[i].valorVenda);
            System.out.println("===========================");
        }
        
        System.out.printf("Digite um Codigo: ");
        int cod = scan.nextInt();
        
        System.out.println("---------------------------");
        System.out.println("      PRODUTO LISTADO      ");
        System.out.println("---------------------------");
        for (i = 0; i < 30; i++) {
            if (produto[i].codigo == cod) {
                System.out.println("Codigo: " + produto[i].codigo);
                System.out.println("Quantidade: " + produto[i].quantidade);
                System.out.printf("Valor de Compra: %.2f\n", produto[i].valorCompra);
                System.out.printf("Valor de Venda: %.2f\n", produto[i].valorVenda);
                System.out.println("===========================");
                break;
            }
        }
        
    }
    
    public static Produto preencherProduto() {
        Produto novoProduto = new Produto();
        //valores gerados aleatoriamente:
        novoProduto.codigo = (int) (Math.random() * 1000);
        novoProduto.quantidade = (int) (Math.random() * 500);
        novoProduto.valorCompra = (Math.random() * 3000);
        novoProduto.valorVenda = (Math.random() * 3000);
        
        return novoProduto;
    }
    
}