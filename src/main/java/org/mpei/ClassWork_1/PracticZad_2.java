package org.mpei.ClassWork_1;

import java.util.Arrays;

public class PracticZad_2 {
    public static void main(String[] args) {
        int[] array = {19, 289, 8, 1, 32, 89, 77, 6};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int val = array[i];
                    array[i] = array[j];
                    array[j] = val;
                }
            }
        }
        System.out.println("\033[0;32m" + Arrays.toString(array));
    }
}
