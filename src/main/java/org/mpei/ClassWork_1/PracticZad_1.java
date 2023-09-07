package org.mpei.ClassWork_1;

public class PracticZad_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 22};
        int summ = 0;
        double otvet;

        for (int i = 0 ; i < arr.length ; i++) {
            summ = summ + arr[i] * arr[i];
            System.out.println(summ);
        }
        otvet = (double) summ / (double) arr.length;
        System.out.println("Среднее квадратичное число: " + otvet);
    }
}
