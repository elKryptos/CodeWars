package Methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KingCompany {
    public static int resistenza (int numero){
        int resistenza = 0;
        while (numero > 10){
            numero = prodotto(numero);
            resistenza++;
        }
        return resistenza;
    }

    public static int prodotto (int numero){
        int prodotto = 1; 
        while (numero > 0){
            prodotto *= numero % 10;
            numero /= 10;
        }
        return prodotto;
    }

    public static int getMaxFrequenti(int [] numero){
        Map <Integer, Integer> frequenza = new HashMap<>();
        for (int num : numero){
            frequenza.put(num, frequenza.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minNum = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequenza.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxFreq || (count == maxFreq && num < minNum)){
                maxFreq = count;
                minNum = num;
            }
        }
        return minNum;
    }

    public static int[] getMaxFrequenti(int [] array, int k){
        Map<Integer, Integer> frequenza = new HashMap<>();
        for (int numero : array){
            frequenza.put(numero, frequenza.getOrDefault(numero, 0) + 1);
        }

        List<Integer> numeri = new ArrayList<>(frequenza.keySet());
        numeri.sort((a, b) -> {
            int freqA = frequenza.get(a);
            int freqB = frequenza.get(b);

            if (freqA != freqB){
                return freqB - freqA;
            } else {
                return a - b;
            }
        });
        return numeri.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
