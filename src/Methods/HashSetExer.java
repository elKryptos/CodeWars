package Methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExer {

    public static void main(String [] args){

    Set<Integer> set1 = new HashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    set1.add(5);
    System.out.println(set1);
    //Rimuove un elemento dall'hashset
    set1.remove(1);
    System.out.println(set1);
    //Verifica se un elemento esiste
    System.out.println(set1.contains(4));
    //Trova la dimensione di un Array
    System.out.println(set1.size());
    //itera riga 26
    for(Integer x: set1) {
        System.out.print(x + " ");
    }
    System.out.println();
    //Converti un HashSet in un Array
    Object[] x = set1.toArray();
    System.out.println(Arrays.toString(x)); 
    //Trova l'intersezione di un Array
    Set<Integer> set2 = new HashSet<>();
    set2.add(2);
    set2.add(1);
    set2.add(7);
    set2.add(5);
    set2.add(8);

    //Trova l'intersezione di 2 Array
    Set<Integer> intersezione = new HashSet<>(set1);
    intersezione.retainAll(set2);
    System.out.println(intersezione);
    //Unione di 2 Array, aggiungi tutti gli elementi di un HashSet in un altro
    set1.addAll(set2);
    System.out.println(set1);
    //Differenza tra 2 Array
    set1.removeAll(set2);
    System.out.println(set1);
    //Verifica se un HashSet è un sottoinsieme di un altro HashSet

    //Usa un iteratore per scorrere un HashSet
    Iterator<Integer> it = set2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    System.out.println();
    //Svuota un HashSet
    set1.clear();
    System.out.println(set1);
    //

    }
}
