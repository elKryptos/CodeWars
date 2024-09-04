package Methods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class Kata {

    public static int paperWork(int n, int m){
        if (n <= 0 || m <= 0) {
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
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) == -1 ) {
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
        for (double number : numbers) {
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
    public static String smash(String... words){
        return String.join(" ", words);
    }

    // Count every true in the Boolean array 
    // ( Wrapper class Boolean not a primitive boolean, be carefull with the "null" )
        public static int countSheeps(Boolean[] arrayOfSheeps){
            int counter = 0;
            for (Boolean value : arrayOfSheeps) {
                if (value != null && value) {
                    counter++;
                }
            }
        return counter;
      }

    // In this little assignment you are given a string of space 
    // separated numbers, and have to return the highest and lowest number.
    public static String highAndLow(String numbers){
        String [] parts = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String part : parts){
            int num = Integer.parseInt(part);
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }
        return highest + " " + lowest;
    }

    public static String oddOrEven(int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }

    public static boolean  isIsogram(String str){
        str = str.toLowerCase();
        HashSet<Character> visto = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (visto.contains(c)) {
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
        if (op == null) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return op.applyAsInt(a, b);
    }

    // You are asked to square every digit of a number and concatenate them
    public static int squareDigits(int n) {
        String number = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for (char value : number.toCharArray()) {
            int digit = Character.getNumericValue(value);
            int squared = digit * digit;
            result.append(squared);
        }
        return Integer.parseInt(result.toString());
    }
    // Given two integers a and b, which can be positive or negative, 
    // find the sum of all the integers between and including them 
    // and return it. If the two numbers are equal return a or b.
    public int GetSum(int a, int b) {
        if (a == b) { 
            return a;
        } else {
            return a + b;
        }
    }

    // ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot 
    // contain anything but exactly 4 digits or exactly 6 digits. 
    // If the function is passed a valid PIN string, return true, else return false.
    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Very simple, given a number (integer / decimal / both depending on the language), 
    // find its opposite (additive inverse).
    public static int opposite(int number){
        int opposite = number;
        if (opposite > 0 || opposite < 0) {
            opposite = number * -1;
        }
        return opposite; 
    }

    /** Dati 2 argomenti, uno il nome del animale e l'altro di un piatto, sempre in lowCase,
     *  le prime e le ultime lettere devono essere uguali
     */
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0)  && 
        beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
    
    // Jaden's Smith Upper case first letter 
    public String toJadenCase(String phrase){
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            String [] words = phrase.split(" ");
            for (String value : words){
                if (value.length() >= 0) {
                    sb.append(Character.toUpperCase(value.charAt(0)))
                    .append(value.substring(1).toLowerCase());
                }
                sb.append(" ");
            }
            return sb.toString().trim();
        }
    }

    /** The goal of this exercise is to convert a string to a new string where each character 
     * in the new string is "(" if that character appears only once in the original string, 
     * or ")" if that character appears more than once in the original string. Ignore capitalization 
     * when determining if a character is a duplicate.*/
    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(word.indexOf(currentChar) != word.lastIndexOf(currentChar)){
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        return sb.toString();
    }

    public static int duplicateCount(String text){
        Map<Character, Integer> charCountMap = new HashMap<>();
        text = text.toLowerCase();
        for (char c : text.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : charCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    // Greet
    public static String greet(String name){
        return "Hello, " + name + " how are you doing today?";
    }
    
    // Calculate if the fuel left is enought to reach the next pump
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double realDistance = mpg * fuelLeft;
        // if(realDistance >= distanceToPump) return true;
        // else return false;
        boolean result = (realDistance >= distanceToPump) ? true : false;
        return result;
    }

    /**In a small town the population is p0 = 1000 at the beginning of a year. 
     * The population regularly increases by 2 percent per year and moreover 50 
     * new inhabitants per year come to live in the town. How many years does the 
     * town need to see its population greater than or equal to p = 1200 inhabitants? */
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while(p0 < p){
            p0 += (int) (p0 * percent / 100 + aug);
            years++;
        }
        return years;
    }

    // Given an array of integers, find the one that appears an odd number of times.
    // There will always be only one integer that appears an odd number of times.
    public static int findIt(int[] a) {
        int result = 0;
        for( Integer num : a){
            result ^= num;
        }
        return result;
    }
}
