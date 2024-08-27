import java.util.Arrays;

import Methods.Kata;

public class App {
    public static void main(String[] args) {
        
        System.out.println(Kata.disemvowel("Hans De la Cruz"));
        double[] numbers = {1, 32, 3.3333};
        System.out.println(Kata.sum(numbers));
        int[] arr =  { 2, 4, 6, 8 };
        int[] fin = Kata.map(arr);
        System.out.println(Arrays.toString(fin)); 
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(Kata.smash(words));

        Boolean[] arrayOfSheeps = {true,  true,  true,  false,
                                    true,  true,  true,  true ,
                                    true,  false, true,  false,
                                    true,  false, false, true ,
                                    true,  true,  true,  true ,
                                    false, false, true,  true};
        System.out.println(Kata.countSheeps(arrayOfSheeps));

        String numbers1 = "1 2 3 4 5 -2 -9";
        System.out.println(Kata.highAndLow(numbers1));
    }
}
