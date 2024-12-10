package Generics;

public class BraccioAutomatico {
    public void prendiBottiglia(Bottiglia<?> bottiglia) {
        System.out.println("Azione preimpostata -> " + bottiglia.getElemento());
    }
    
}
