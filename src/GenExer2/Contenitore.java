package GenExer2;

public class Contenitore<T extends Liquido> {
    private T contenuto;

    public Contenitore(T contenuto) {
        this.contenuto = contenuto;
    }

    public T getContenuto() {
        return contenuto;
    }
    
    public void descriviContenuto() {
        contenuto.descrivi();
    }
}
