package Methods;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class Kata {

    public static int paperWork(int n, int m) {
        if ( n <= 0 || m <= 0){
            return 0;
        } else{
            int res = n * m;
            return res;
        }
    }

    // Remove every vocal in the string
    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for( char ch : str.toCharArray()){
            if( vowels.indexOf(ch) == -1 ){
                result.append(ch);
            }
        }
        return result.toString();
    }

    /** Function that takes an array of numbers and returns the sum of the numbers. 
       The numbers can be negative or non-integer. 
       If the array does not contain any numbers then you should return 0. **/
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for( double number : numbers) {
            sum += number; 
        }
        return sum;
    }

    // Given an array of integers, return a new array with each value doubled.
    public static int[] map(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i] * 2;
        }
        return result;
    }

    public static String updateLight(String current) {
        switch (current.toLowerCase()) {
            case "green": 
                return "yellow";
            case "yellow": 
                return "red";
            case "red" : 
                return "green";
        }
        return current;
    }
     
    // Convert an Array of words to a String
    public static String smash(String... words) {
        return String.join(" ", words);
    }

    // Count every true in the Boolean array 
    // ( Wrapper class Boolean not a primitive boolean, be carefull with the "null" )
        public static int countSheeps(Boolean[] arrayOfSheeps) {
            int counter = 0;
            for( Boolean value : arrayOfSheeps){
                if(value != null && value){
                    counter++;
                }
            }
        return counter;
      }

    // In this little assignment you are given a string of space 
    // separated numbers, and have to return the highest and lowest number.
    public static String highAndLow(String numbers) {
        String [] parts = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String part : parts){
            int num = Integer.parseInt(part);
            if(num > highest) highest = num;
            if(num < lowest) lowest = num;
        }
        return highest + " " + lowest;
    }

    public static String oddOrEven (int[] array) {
        int sum = 0;
        for( int value : array){
            sum += value;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        HashSet<Character> visto = new HashSet<>();
        for( char c : str.toCharArray()){
            if( visto.contains(c)){
                    return false;
                }
            visto.add(c);
        }
        return true;
    }

    // Given two numbers and an arithmetic operator (the name of it, as a string), 
    // return the result of the two numbers having that operator used on them.
    public static int arithmetic(int a, int b, String operator){
        Map<String, IntBinaryOperator> operations = new HashMap<>(); 
        operations.put("add", (x, y) -> x + y);
        operations.put("subtract", (x, y) -> x - y);
        operations.put("multiply", (x, y) -> x * y);
        operations.put("divide", (x, y) -> x / y);
        IntBinaryOperator op = operations.get(operator);
        if( op == null){
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return op.applyAsInt(a, b);
    }

    // You are asked to square every digit of a number and concatenate them
    public static int squareDigits(int n) {
        String number = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for( char value : number.toCharArray()){
            int digit = Character.getNumericValue(value);
            int squared = digit * digit;
            result.append(squared);
        }
        return Integer.parseInt(result.toString());
    }
    
}


