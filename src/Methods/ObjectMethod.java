package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ObjectMethod {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("United States");
        lista.add("Siria");
        lista.add("North Korea");
        lista.add("Iran");
        lista.get(3);
        Object [] test = lista.toArray();
        System.out.println(Arrays.toString(test));

        // String [] test1 = lista.toArray(new String[0]);
        // System.out.println(Arrays.toString(test1));
        
        for(String s : lista) {
            System.out.println(s);
        }

        for(int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+ " ");
        }

        System.out.println();
        List<String> cloneLista = new ArrayList<>(lista);
        System.out.println(cloneLista);

        lista.set(1, "France");
        System.out.println(lista);

        lista.add(4, "Germany");
        System.out.println(lista);

        lista.addAll(cloneLista);
        System.out.println(lista);

        List<String> lista2 = lista.subList(0, 3);
        System.out.println(lista2);

        lista2.clear();
        System.out.println(lista2);

        Collections.sort(lista);
        System.out.println(lista);

        List<String> prova = new ArrayList<>();
        Collections.sort(prova);
        System.out.println(prova);
    }
}


