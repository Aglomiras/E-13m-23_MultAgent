package org.mpei.ClassWork_1;

public class Practic {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Сумма двух чисел: ");
        int sum = sum(10, 12);
        System.out.println(sum);

        System.out.println("Деление двух чисел: ");
        int del = printDiv(32, 4);
        System.out.println(del);

    }
    /**
     * Создание функции для вычисления суммы двух элементов!
     * public - функция публична
     * static - методы функции можно использовать без создания экземпляры класса
     * (sum) - название функции
     */

    public static int sum(int a, int b) {
        int res = a + b;
        return res;
    }
//    public static void printDiv(int num, int den) {
//        if (den == 0) {
//            System.out.println("Can not perform 0 division ");
//            return;
//        }
//        System.out.println(num/den);
//    }
    public static int printDiv(int num, int den) {
        if (den == 0) {
            System.out.println("\033[0;31m" +  "Can not perform 0 division ");
            return 404;
        } else {
            return (num / den);
        }
    }

}
