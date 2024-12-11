package Methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExer {
    public static void main (String [] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "America");
        map.put(2, "Canada");
        map.put(3, "France");
        map.put(4, "Germany");
        map.put(5,"Rusia");
        System.out.println(map);
        String key = map.get(10);
        System.out.println(key);

        //map.remove(4);
        
        String test = map.get(1);
        System.out.println(test);

        int keyToCheck = 2;
        if (map.containsKey(keyToCheck)){
            System.out.println("La chiave " + keyToCheck + " esiste");
        } else {
            System.out.println("La chiave " + keyToCheck + " non esiste");
        }

        String valuesToCheck = "France";
        if (map.containsValue(valuesToCheck)) {
            System.out.println("Il valore " + keyToCheck + " esiste");
        } else {
            System.out.println("La chiave " + keyToCheck + " non esiste");
        }

        System.out.println(map.size());

        //Itera atrraverso tutte le chiavi di una HashMap
        Iterator<Map.Entry<Integer,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> entry = iter.next();
            System.out.print("Key: " + entry.getKey() + " ");
        }
        System.out.println();
        for(Integer cod : map.keySet()) {
            System.out.print("key: " + cod + " ");
        }

        map.forEach((k, v) -> System.out.println("chiave: " + k));


        //Itera attraverso tutte i valori di una HashMap
        Iterator<Map.Entry<Integer, String>> iter1 = map.entrySet().iterator();
        while (iter1.hasNext()) {
            Map.Entry<Integer, String> entry1 = iter1.next();
            System.out.print("Values: " + entry1.getValue() + " ");
        }

        System.out.println();
        for(String values : map.values()) {
            System.out.print("Values: " + values + " ");
        }

        System.out.println();
        map.forEach((k1, v1) -> System.out.print("Values: " + v1 + " "));

        System.out.println();
        Iterator<Map.Entry<Integer, String>> iter2 = map.entrySet().iterator();
        while(iter2.hasNext()) {
            Map.Entry<Integer, String> entry2 = iter2.next();
            System.out.print("Key: " + entry2.getKey() + " -- Value: " + entry2.getValue() + " | ");
        }
        System.out.println();
        for(Map.Entry<Integer, String> all: map.entrySet()) {
            System.out.print("Key: " + all.getKey() + " -- Value: " + all.getValue() + " | ");
        }
        System.out.println();
        map.forEach((k2, v2) -> System.out.print("Key: " + k2 + " -- Value: " + v2 + " | "));



        // Iterator<Map.Entry<Integer, String>> iter3 = map.entrySet().iterator();
        // while (iter3.hasNext()) {
        //     Map.Entry<Integer,String> entry3 = iter3.next();
        //         for() {
                    
        //         }

        System.out.println();
        int z = 0;
        for (Map.Entry<Integer, String> entry4 : map.entrySet()) {
            if (entry4.getKey() > z) {
                z = entry4.getKey();
            }
        }
        System.out.println(z);

        HashMap<Integer, String> second = new HashMap<Integer, String>();
        second.put(1, "one");
        second.put(2, "two");
        second.put(3, "three");
        System.out.println(second);
        
    }
}
