package org.mpei.HomeWork_1;

import java.util.Scanner;

public class ScanerMain {
    public static void main(String[] args) {

       /**
        * - Задано число int. Вывести в консоль "четное!", если число четное. Вывести в консоль "нечетное..",
        * если число нечетное. В конце записи вывести само число.
        */

        //Создание сканера
        Scanner intScan = new Scanner(System.in);
        System.out.println("Введите число: ");

        //Проверка вводимых данных
        while (!intScan.hasNextInt()) {
            System.out.println("Вы ввели не число типа int! Попробуйте еще раз.");
            intScan.next();
        }
        int value = intScan.nextInt();

        //Проверка четности числа
        if (value % 2 == 0) {
            System.out.println("\033[0;32m" + "четное!");
        } else {
            System.out.println("\033[0;31m" + "нечетное..");
        }

        //Вывод в консоль и закрытие сканера
        System.out.println("\033[0;34m" + "Введенное число: " + value);
        intScan.close();
    }
}
