package Generics;

public class Acqua extends Bevanda{
    
    @Override
    public String toString() {
        return "Sto bevendo acqua";
    }

    public void finisciAcqua() {
        System.out.println("Sto buttando l'acqua!");
    }
    
}

