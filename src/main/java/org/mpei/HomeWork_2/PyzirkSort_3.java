package org.mpei.HomeWork_2;

import java.util.Arrays;
import java.util.Scanner;

public class PyzirkSort_3 {
    public static int[] pyzirk(int[] arrayVvod) {
        for (int i = 0; i < arrayVvod.length; i++) {
            for (int j = i + 1; j < arrayVvod.length; j++) {
                if (arrayVvod[j] < arrayVvod[i]) {
                    int val = arrayVvod[i];
                    arrayVvod[i] = arrayVvod[j];
                    arrayVvod[j] = val;
                }
            }
        }
        return arrayVvod;
    }
    public static double median(int sizeArray, int[] arrayVvod) {
        int delCel = sizeArray % 2;
        int delOst = sizeArray / 2;
        if (delCel == 1) {
            return arrayVvod[sizeArray / 2];
        } else {
            double med = (double) (arrayVvod[delOst - 1] + arrayVvod[delOst]) / 2;
            return med;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements contained in the array: ");
        Scanner vvod = new Scanner(System.in);
        int sizeArray = vvod.nextInt();
        int arrayVvod[] = new int[sizeArray];

        System.out.println("Enter all the elements of the array: ");
        for (int i = 0; i < sizeArray; i++) {
            arrayVvod[i] = vvod.nextInt();
            if (i < sizeArray - 1) {
                System.out.println("Enter the following element: ");
            } else {
                System.out.println("Enter the last element: ");
            }
        }
        System.out.println("\n" + "\033[0;34m" + "The entered array: " + Arrays.toString(arrayVvod));
        arrayVvod = pyzirk(arrayVvod);
        System.out.println("\n" + "\033[0;32m" + "Sorted array: " + Arrays.toString(arrayVvod));
        System.out.println("\n" + "\033[0;32m" + "Median of the array: " + median(sizeArray, arrayVvod));
    }
}
