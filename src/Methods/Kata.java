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
        int l = numbers.length + 1;
        int addition = (l * (l + 1)) / 2;
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

    public static String reverse2(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
