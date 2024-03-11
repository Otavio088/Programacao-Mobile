/*
    8. Gere uma matriz de 10 x 10 elementos. Calcule a soma dos 
    elementos que estão na diagonal principal.
 */
package exercicio08;

public class Exercicio08 {

    public static void main(String[] args) {
        int m[][] = new int[10][10];
        int DP = 0;
        
        System.out.println("\n--------------------------------------------------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50);
                
                if (i == j) {
                    DP += m[i][j];
                }
                
                System.out.printf("%d\t",m[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Soma dos elementos da diagonal principal: " + DP);
    }
    
}
