package Generics;

public class Bottiglia<T> {
    private T elemento;

    public Bottiglia() {};

    public Bottiglia(T elemento){
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }
    
}
