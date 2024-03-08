/*
    8. Sejam as amostras de tamanho n=5, X={2,7,4,3,2} e Y={1,2,3,6,5}, 
    realize os seguinte cálculos, conforme:
        
        5               5                   4              5
    a. Σ X[j]       b. Σ X[j]Y[j]        c.Σ X[j]Y[j]^2 + Σ 3 
        j=1             j=1                 j=2            j=1
*/
package ex8;

public class Ex8 {

    public static void main(String[] args) {
        int n = 5, S = 0, i;
        int x[] = {2,7,4,3,2};
        int y[] = {1,2,3,6,5};
        
        for (i = 0; i < x.length; i++) {
            S += x[i];
        }
        System.out.println("a. " + S); S = 0;
        
        for (i = 0; i < x.length; i++) {
            S += (x[i] * y[i]);
        }
        System.out.println("b. " + S); S = 0;
    
        for (i = 0; i < x.length-1; i++) {
            S += Math.pow((x[i] * y[i]),2);
        }
        S += 3 * x.length;
        System.out.println("c. " + S);
    }
    
}