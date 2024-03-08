/*
    10. Uma venda de alimentos precisa contabilizar suas vendas. 
    Para tanto, crie um programa que solicite o usuário o informe 
    de 10 vendas. A cada venda deverá ser informado: codigo produto, 
    valor unitario e quantidade. Use uma classe para representar a 
    Venda. O programa deverá:
        a. A cada venda informada mostrar o valor total (quantidade * valor unitario);
        b. Valor médio vendido;
        c. Mostrar o código do produto, quantidade e valor total do produto com maior venda;
        d. Mostrar o código do produto, quantidade e valor total do produto com menor venda;
        e. Mostrar o valor Total Vendido;
        f. Mostrar a quantidade total de itens vendidos;
*/
package ex10;

public class Ex10 {

    public static void main(String[] args) {
        Venda venda[] = new Venda[10], maiorVenda = new Venda(), menorVenda = new Venda();
        double valorMedioVendido = 0, valorTotalVendido = 0;
        int quantidadeTotalVendido = 0;
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Codigo\tValor Unitario\tQuantidade\tValor Total");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            venda[i] = preencherVendas();
            
            System.out.printf("%d\t%.2f\t\t%d\t\t%.2f\n", venda[i].codigoProduto, venda[i].valorUnitario, venda[i].quantidade, (venda[i].valorUnitario * venda[i].quantidade));
            
            valorTotalVendido += (venda[i].valorUnitario * venda[i].quantidade);
            
            quantidadeTotalVendido += venda[i].quantidade;
        }
        System.out.println("-----------------------------------------------------------------------");
        
        valorMedioVendido = (valorTotalVendido / venda.length);
        System.out.printf("Valor medio vendido: %.2f\n", valorMedioVendido );
        System.out.println("-----------------------------------------------------------------------");
        
        maiorVenda = buscarMaiorVenda(venda, maiorVenda);
        System.out.println("Informacoes da maior venda: ");
        System.out.println("Codigo: " + maiorVenda.codigoProduto);
        System.out.println("Quantidade: " + maiorVenda.quantidade);
        System.out.printf("Valor total: %.2f\n", (maiorVenda.valorUnitario * maiorVenda.quantidade));
        System.out.println("-----------------------------------------------------------------------");
        
        menorVenda = buscarMenorVenda(venda, menorVenda);
        System.out.println("Informacoes da menor venda: ");
        System.out.println("Codigo: " + menorVenda.codigoProduto);
        System.out.println("Quantidade: " + menorVenda.quantidade);
        System.out.printf("Valor total: %.2f\n", (menorVenda.valorUnitario * menorVenda.quantidade));
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.printf("Valor total vendido: %.2f\n", valorTotalVendido );
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.printf("Quantidade total de itens vendidos: %d\n", quantidadeTotalVendido);
        System.out.println("-----------------------------------------------------------------------");
    }
    
    public static Venda buscarMenorVenda(Venda ven[], Venda menorVenda) {
        menorVenda = null;
        
        for (int i = 0; i < ven.length; i++) {
            if (menorVenda == null) {
                menorVenda = ven[i];
            }
            if ((menorVenda.valorUnitario * menorVenda.quantidade) > (ven[i].valorUnitario * ven[i].quantidade)) {
                menorVenda = ven[i];
            }
        }
        
        return menorVenda;
    }
    
    public static Venda buscarMaiorVenda(Venda ven[], Venda maiorVenda) {
        maiorVenda = null;
        
        for (int i = 0; i < ven.length; i++) {
            if (maiorVenda == null || (maiorVenda.valorUnitario * maiorVenda.quantidade) < (ven[i].valorUnitario * ven[i].quantidade)) {
                maiorVenda = ven[i];
            }
        }
        
        return maiorVenda;
    }
    
    public static Venda preencherVendas() {
        Venda novaVenda = new Venda();
        
        novaVenda.codigoProduto = (int) (Math.random() * 1000);
        novaVenda.quantidade = (int) (Math.random() * 350);
        novaVenda.valorUnitario = Math.random() * 1000;
        
        return novaVenda;
    }
}