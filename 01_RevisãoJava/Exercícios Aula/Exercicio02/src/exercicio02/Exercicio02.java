/*
  02) Deseja-se um conjunto de numeros inteiros e impares, com 20 elementos. 
  Crie um programa que popule, de modo arbitrario, um vetor V com tais numeros 
  e exiba-o. Exibindo o nº total de iterações necessarias para preencher o vetor.
*/

package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        int V[] = new int[20];
	int cont = 0;

	int aux = 0;
	for (int i = 0; i < 20; i++) {
            do {
                aux = (int) (Math.random() * 100);
	        if (aux%2 != 0) {
	          V[i] = aux;
	        }
	        
	        cont++;
	    } while (V[i] == 0);
	}

	for (int i = 0; i < 20; i++) {
            System.out.printf("%d ", V[i]);
	}
	    
        System.out.printf("\nIteracoes: %d\n", cont);
    }
    
}
