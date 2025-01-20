package GenExer2;

public class Main {
    public static void main (String [] args) {
        Contenitore<Acqua> acqua = new Contenitore<Acqua>(new Acqua());
        Contenitore<Olio> olio = new Contenitore<Olio>(new Olio());
        acqua.descriviContenuto();
        olio.descriviContenuto();
    }
}
