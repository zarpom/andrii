package lesson7;

import java.util.Arrays;

public class BumbleSorting {
    public static void main(String[] args) {
        int[] massiv = {45, 25, 41, 56, 10};
        for (int i = 0; i < massiv.length - 1; i++) {
            if (massiv[i] > massiv[i + 1]) {
                int temp = massiv[i];
                massiv[i] = massiv[i + 1];
                massiv[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(massiv));

    }
}
