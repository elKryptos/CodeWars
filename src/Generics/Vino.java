package Generics;

public class Vino extends Bevanda {

    @Override
    public String toString() {
        return "Sto bevendo vino";
    }

    public void finisci() {
        System.out.println("Sto finendo il vino!");
    }

    public void invecchia() { 
        System.out.println("Sto invecchiando il vino");
    }
    
}
