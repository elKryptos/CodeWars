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

    public static String inverse(String testo) {
        char[] copia = testo.toCharArray();
        int l = copia.length;
        for(int i = 0; i < l / 2; i++) {
            char temp = copia[i];
            copia[i] = copia[l - i -1];
            copia[l - i - 1] = temp;
        }
        String invertita = new String(copia);
        return invertita;
    }
}
