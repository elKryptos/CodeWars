package Methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExer {

    public static void main(String [] args){

    Set<String> set = new HashSet<>();
    set.add("Mela");
    set.add("Uva");
    set.add("Pera");
    set.add("Fragola");
    set.add("Kiwi");
    System.out.println(set);

    set.remove("Uva");
    System.out.println(set);
    System.out.println(set.contains("Uva"));
    System.out.println(set.size());
    Object[] x = set.toArray();
    System.out.println(Arrays.toString(x)); 

    
    }
}
