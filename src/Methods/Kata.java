package Methods;

import java.util.*;

public class Kata {

   //aumenta il valore di 1 
    public static int[] aumenta(int[] num) {
        int l = num.length;
        int[] aumentato = new int[l];
        for(int i = 0; i < l; i++) {
            aumentato[i] = num[i] + 1;
        }
        return aumentato ;
    }

    //conta da 1 al 100, per ogni multiplo di 3 Fizz, 5 Buzz, 3 e 5 FizzBuzz
    public static String[] fizzBuzz() {
        int l = 100;
        String[] numbers = new String[l];
        for(int i = 0; i < 100; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                numbers[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                numbers[i] = "Fizz";
            } else if ((i + 1 ) % 5 == 0) {
                numbers[i] = "Buzz";
            } else {
            numbers[i] = Integer.toString(i + 1);
            }
        }
        return numbers;
    }

    //Find the missing number
    public static int finder(int[] numbers) {
        int n = numbers.length + 1;
        int addition = (n * (n + 1)) / 2;
        int actual = 0;
        for (int i = 0; i < numbers.length; i++) {
            actual += numbers[i];
        }
        return addition - actual;
    }

    //Invertire una stringa
    public static String reverse(String text) {
        char[] parole = text.toCharArray();
        int l = parole.length;
        for (int i  = 0; i < l / 2; i++) {
            char temp = parole[i];
            parole[i] = parole[l - i - 1];
            parole[l - i -1] = temp;
        }
        return new String(parole);
    }

    public static String reverse3(String text) {
        char[] parole = text.toCharArray();
        int l = parole.length;
        for (int  i = 0; i < l/2; i++) {
            char temp = parole[i];
            parole[i] = parole[l -i -1];
            parole[l-i-1] = temp;
        }

        return new String(parole);


    }

    public static String reverse2(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    //fibonacci ricorsivo
    public static int fibonacciRec(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    //fibonacci iterative
    public static int fibonacciIter(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b; 
            b = c;
        }
        return b;
    }

    public static void printer(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciIter(i) + " ");
        }
    }

    //fattoriale
    public static int fattorialeRec(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fattorialeRec(n - 1);
    }

    public static int fattorialeIter(int n) {
        int result = 1; 
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean anagramChecker(String str1, String str2) {
        str1 = str1.trim().replaceAll("\\s+", "").toLowerCase();
        str2 = str2.trim().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        char[] c1 = str1.toCharArray();
        char[] c2 = str1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    //anagram to fix, not considering position letters
    public static boolean anagram2(String str1, String str2) {
        str1 = str1.trim().replaceAll("\\s+", "").toLowerCase();
        str2 = str2.trim().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charCounter.containsKey(c)) return false;
            charCounter.put(c, charCounter.get(c) - 1);
            if (charCounter.get(c) == 0) charCounter.remove(c);

        }
        return charCounter.isEmpty();
    }


}
