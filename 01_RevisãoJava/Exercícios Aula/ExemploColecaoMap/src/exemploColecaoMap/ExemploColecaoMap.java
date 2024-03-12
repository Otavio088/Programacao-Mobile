package exemploColecaoMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class ExemploColecaoMap {

    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        
        mapa.put(1, "Amanda");
        mapa.put(24, "Lucas");
        
        System.out.println(mapa.get(1));
        System.out.println(mapa.get(24));
        System.out.println(mapa.get(99));
        
        mapa.put(24, "Pablo");
        System.out.println(mapa.get(24));
        
        //iterar
        for (Entry<Integer, String> m : mapa.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
    
}