package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExer {
    public static void main(String[] args) {

    // Crea una ArrayList di Stringhe e aggiungi alcuni elementi.
        List<String> lista = new ArrayList<>();
        lista.add("United States");
        lista.add("England");
        lista.add("Australia");
        lista.add("Japan");
        lista.add("Wakanda");
        lista.get(3);
        Object [] test = lista.toArray();
        System.out.println(Arrays.toString(test));

    // Itera attraverso tutti gli elementi della ArrayList usando un ciclo for.
        for(int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        
        for (String el : lista) {
            System.out.print( el + " ");
        }
        System.out.println();

    // Converti una ArrayList in un array.
        Object[] listaToArray = lista.toArray();
        System.out.println("Riga 38");
        System.out.println(Arrays.toString(listaToArray));

    // Ordina gli elementi della ArrayList.
        Collections.sort(lista);

    // Copia tutti gli elementi di una ArrayList in un'altra ArrayList.

    // Svuota una ArrayList.
        // lista.clear();
        // System.out.println(lista);

    // Aggiungi tutti gli elementi di una ArrayList a un'altra ArrayList.
        // lista.addAll(lista);
        // System.out.println(lista);

    // Clona una ArrayList.
        List<String> clone = new ArrayList<String>(lista);
        System.out.println(clone);

    // Sostituisci un elemento specifico in una ArrayList.
        lista.set(1, "France");
        System.out.println(lista);

    // Aggiungi un elemento in una posizione specifica nella ArrayList.
        lista.add( 0, "Germany");
        System.out.println(lista);

    // Usa un iteratore per scorrere la ArrayList.
        Iterator<String> iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    
    // Usa i metodi subList e clear su una ArrayList.
        // List<String> lista2 = lista.subList(0, 3);
        // System.out.println(lista2);

    // Converti una ArrayList in una lista non modificabile.
        Collections.unmodifiableList(lista);
        System.out.println();

    // Filtra gli elementi di una ArrayList usando una funzione lambda.
        lista.stream().forEach(country -> System.out.print(country + " "));
        System.out.println();


    /*------------------------------------------------------------------------------*/
    User john = new User("John", "McKenzie");
    User joe = new User("Joe", "Biden");
    User marco = new User("Marco", "Rossi");

    List<User> listUsers = Arrays.asList(joe, john, marco);
    System.out.println(listUsers);

    System.out.println("riga 91");
    for(User x: listUsers) {
        System.out.print(x + " ");
    }
    
    System.out.println();
    List<User> findName = listUsers.stream()
                                .filter(x -> x.getName().startsWith("Joe"))
                                .collect(Collectors.toUnmodifiableList());

    System.out.println("Riga 104");
    System.out.println(findName);

    //trasformo gli User in una lista di tipo String
    List<String> persons = listUsers.stream().map(user -> user.getName() + " " + user.getSurname())
                            .collect(Collectors.toList());
    Object[] y = persons.toArray();
    System.out.println("Riga 109");
    System.out.println(y);

    //Esegui operazioni di fusione e differenza tra due ArrayList.
    lista.addAll(persons);
    System.out.println(lista);

    lista.removeAll(persons);
    System.out.println(lista);  

    }



    static class User {

        private String name; 
        private String surname;

        public String getName() {
            return name;
        }

        public void setName (String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public User() {}

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return name + " " + surname;
        }
        
    }
}