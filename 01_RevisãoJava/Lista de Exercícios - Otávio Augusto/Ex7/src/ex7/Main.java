/*
    7. Crie uma classe que represente um aluno considerando os atributos: nome, 
    p1, p2. Em outra classe, no mesmo pacote crie uma classe principal (Main.java) 
    e:  
        a. crie uma variável a1 do tipo aluno que receba a instância de Aluno;
        b. atribua valores arbitrários;
        c. mostre os valores;
        d. crie uma variável a2 que receba a1;
        e. altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2;
        f. os valores são diferentes? explique.

 */
package ex7;

public class Main {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Fabio";
        a1.p1 = 8.5;
        a1.p2 = 10;
        
        System.out.println("------------------------");
        System.out.println("           a1           ");
        System.out.println("------------------------");
        System.out.println(a1.nome);
        System.out.println(a1.p1);
        System.out.println(a1.p2);
        System.out.println("------------------------\n");
     
        Aluno a2 = a1;
        a2.p1 = 5;
        a2.p2 = 7;
        
        System.out.println("------------------------");
        System.out.println("           a1           ");
        System.out.println("------------------------");
        System.out.println(a1.nome);
        System.out.println(a1.p1);
        System.out.println(a1.p2);
        System.out.println("------------------------\n");
        
        System.out.println("------------------------");
        System.out.println("           a2           ");
        System.out.println("------------------------");
        System.out.println(a2.nome);
        System.out.println(a2.p1);
        System.out.println(a2.p2);
        System.out.println("------------------------\n");
        
        /*f. Os valores são exatamente iguais. Isso porque ao atribuir a1 para 
        a2, o que está acontecendo é que a variavel a2 passa a manipular o mesmo
        endereço de memoria que a1 manipula. Isso ocorre porque só a variavel
        a1 reservou um espaço na memória quando usou "Aluno a1 = new Aluno();" 
        para criar um Objeto.*/
        
    }
    
}