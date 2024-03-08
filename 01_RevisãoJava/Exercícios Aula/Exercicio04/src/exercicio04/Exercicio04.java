/*
    04) Crie uma classe chamada Venda com os seguintes atributos:
    codigo, valor unitario e quantidade.

    a. Crie um metodo que gere dados de uma venda de modo aleatório;

    b. Gere dados de 10 vendas (gere um vetor);

    c. Crie as seguintes funções que deverão receber o vetor de vendas:
        I. Calcular o valor total vendido;
        II. Calcular o valor medio das vendas;
        III. Mostrar os dados da venda que tem maior quantidade;
    
*/

package exercicio04;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Venda vendas[] = new Venda[10];
        
        int j = 1;
        for (int i = 0; i < vendas.length; i ++) {
            vendas[i] = dadosVendaAleatoria();
            
            System.out.printf("%d Venda: \n\n", j);
            System.out.printf("Codigo: %d\n", vendas[i].codigo);
            System.out.printf("Quantidade: %d\n", vendas[i].quantidade);
            System.out.printf("Valor Unitario: %.2f\n", vendas[i].valorUnitario);
            System.out.println("--------------------------");
            j++;
        }
    
        Double totalVendas = valorTotalVendas(vendas);
        System.out.printf("Valor total vendido: %.2f\n\n", totalVendas);
        
        Double mediaVendas = valorMedioVendas(vendas, totalVendas);
        System.out.printf("Valor medio das ventas: %.2f\n\n", mediaVendas);
        
        Venda vendaQuantidade = new Venda();
        
        vendaQuantidade = vendaMaiorQuantidade(vendas, vendaQuantidade);
        System.out.println("Dados da venda com maior quantidade: ");
        System.out.printf("Codigo: %d\n", vendaQuantidade.codigo);
        System.out.printf("Quantidade: %d\n", vendaQuantidade.quantidade);
        System.out.printf("Valor Unitario: %.2f\n", vendaQuantidade.valorUnitario);
        System.out.println("--------------------------");
    }
    
    public static Venda vendaMaiorQuantidade(Venda ven[], Venda vendaQuantidade) {
        vendaQuantidade.quantidade = 0;
        
        for (int i = 0; i < ven.length; i++) {
            if (ven[i].quantidade > vendaQuantidade.quantidade) {
                vendaQuantidade = ven[i];
            }
        }
        
        return vendaQuantidade;
    }
    
    public static Double valorMedioVendas(Venda ven[], Double totalVendas) {
        
        return (totalVendas/ven.length);
    }
    
    public static Double valorTotalVendas(Venda ven[]) {
        Double totalVendas = 0.0;
        
        for (int i = 0; i < ven.length; i++) {
            totalVendas += (ven[i].valorUnitario * ven[i].quantidade);
        }
        
        return totalVendas;
    }
    
    public static Venda dadosVendaAleatoria() {
        Venda novaVenda = new Venda();
        
        novaVenda.codigo = (int) (Math.random() * 1000);
        novaVenda.quantidade = (int) (Math.random() * 100);
        novaVenda.valorUnitario = (Math.random() * 1000);
        
        return novaVenda;
    }
    
}
