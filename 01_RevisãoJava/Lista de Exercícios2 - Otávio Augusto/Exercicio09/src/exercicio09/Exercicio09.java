/*
    9. Faça um programa para gerar automaticamente números 
    entre 0 e 99 de uma cartela de bingo. Sabendo que cada 
    cartela deverá conter 5 linhas de 5 números, gere estes 
    dados de modo a não ter números repetidos dentro das 
    cartelas. O programa deve exibir na tela a cartela gerada.
*/
package exercicio09;

public class Exercicio09 {

    public static void main(String[] args) {
        int m[][] = new int[5][5];
        int aux = 0;
        boolean repetido;
        
        System.out.println("-------------------------------------");
        System.out.println("       CARTELA DE BINGO GERADA       ");
        System.out.println("-------------------------------------");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do {
                    aux = (int) (Math.random() * 100);
                    repetido = false;
                    
                    for (int l = 0; l < i; l++) {
                        for (int c = 0; c < j; c++) {
                            if (aux == m[l][c]) {
                                repetido = true;
                                break;
                            }
                        }
                        if (repetido) break;
                    }
                } while (repetido);
                
                m[i][j] = aux;
                System.out.printf("%d\t", m[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");
    }
}