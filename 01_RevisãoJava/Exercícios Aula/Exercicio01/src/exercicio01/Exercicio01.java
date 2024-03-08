/*
    01) Crie dois vetores de inteiro de tamanho 10. Crie vetor Soma para somar ambos. 
    Exiba como no modelo:
    ------------------------
      A  +  B  =  Soma
    ------------------------
      1  +  2  =  3
      4  +  1  =  5
      5  +  2  =  7
    ------------------------
*/

package exercicio01;

public class Exercicio01 {
    
    public static void main(String[] args) {
        int v1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int v2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int soma[] = new int[10];

	System.out.println("---------------------------------");
        System.out.println(" A\t+\tB\t=  Soma");
	System.out.println("---------------------------------");
        
        for (int i = 0; i < 10; i++) {
            soma[i] = v1[i] + v2[i];
            System.out.printf(" %d\t+\t%d\t=  %d\n", v1[i], v2[i], soma[i]);
	}
        
        System.out.println("---------------------------------");
    }
    
}