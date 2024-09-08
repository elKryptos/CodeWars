import java.util.Arrays;

import Methods.KingCompany;

public class App {
    public static void main(String[] args) {
        int[] array = {1, 52, 52, 52, 1, 56, 1, 54, 54, 1, 54};
        System.out.println(Arrays.toString(KingCompany.getMaxFrequenti(array, 3)));
    }
}
