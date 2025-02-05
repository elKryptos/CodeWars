import Methods.Kata;

public class App {
    public static void main(String[] args) {
        System.out.println(Kata.fibonacciIter(4));
        Kata.printer(4);
        System.out.println();
        String str1 = "Hans Sindey";
        String str2 = "Hans Sidney";
        System.out.println(Kata.anagramChecker(str1, str2));

    }
}
