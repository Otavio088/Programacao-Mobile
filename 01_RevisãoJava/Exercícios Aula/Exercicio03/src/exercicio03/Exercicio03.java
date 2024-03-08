/*
  3) Crie uma função que receba 2 parametros:
    valor(faotorial) e multiplo

    Ela deverá retornar quantos números entre o valor e 0
    tem o multiplo especificado como parametro.
*/

package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
    Integer n = 5;
    Integer m = 4;

    Integer f = calcularFatorial(n);
    
    System.out.printf("Fatorial de %d = %d", n, f);

    Integer x = quantidadeMultiplos(f, m);

    System.out.printf("\nQuantidade de Multiplos entre 0 e %d de %d = %d\n", f, m, x);
    }
    
    public static Integer quantidadeMultiplos(Integer f, Integer m) {
    Integer qtd = 0;
    
    for (int i = 0; i <= f; i++) {
      if (i % m == 0) {
        qtd++;
      }
    }

    return qtd;
  }
  
  public static Integer calcularFatorial(Integer n) {
    Integer fatorial = 1;

    for (int i = 1; i <= n; i++) {
      fatorial *= i;
    }

    return fatorial;
  }
}