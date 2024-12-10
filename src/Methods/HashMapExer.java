package Methods;

import java.util.HashMap;
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
        


    }
}
