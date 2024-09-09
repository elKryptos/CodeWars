package Methods;

public class CodeGrind {

    // Somma degli elementi di un array di interi
    public static int somma (int[] array){
        int result = 0;
        for (int value : array){
            result += value;
        }
        return result;
    } 

    // Trovare il valore massimo in un array di numeri interi
    public static int maxNum(int[] array){
        int maxNum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int minNum(int[] array){
        int minNum = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minNum){
                minNum = array[i];
            }
        }
        return minNum;
    }
}
