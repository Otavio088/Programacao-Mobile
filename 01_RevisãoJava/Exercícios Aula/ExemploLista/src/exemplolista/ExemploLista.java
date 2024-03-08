package exemplolista;


import java.util.List;
import java.util.ArrayList;
public class ExemploLista {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        
        System.out.println("for: ");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.printf("valor da posicao %d: %d\n", i, listaNumeros.get(i));
        }
        
        System.out.println("-----------------------------");
        System.out.println("for enchanced: ");
        
        for (Integer n : listaNumeros) {
            System.out.println("valor: " + n);
        }
        
    }
    
}