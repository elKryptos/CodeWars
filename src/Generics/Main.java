package Generics;

public class Main {
    public static void main (String [] args) {
        Bottiglia<Acqua> acqua = new Bottiglia<Acqua>(new Acqua());
        Bottiglia<Vino> vino = new Bottiglia<Vino>(new Vino());
        BraccioAutomatico braccio = new BraccioAutomatico();
        braccio.prendiBottiglia(acqua);
        braccio.prendiBottiglia(vino);     
        acqua.getElemento().bevi();
        acqua.getElemento().finisciAcqua();
        vino.getElemento().bevi();
        vino.getElemento().invecchia(); 
        
    }
    
}
