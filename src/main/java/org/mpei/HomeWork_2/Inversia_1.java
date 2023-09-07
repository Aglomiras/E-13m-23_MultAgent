package org.mpei.HomeWork_2;

import java.util.Scanner;

public class Inversia_1 {
    /**
     * Задано число типа int. Необходимо вывести его в консоль справа налево (без применения класса String).
     * */
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner intVal = new Scanner(System.in);

        while (!intVal.hasNextInt()) {
            System.out.println("You didn't enter an int number! Try again.");
            intVal.next();
        }
        int intVal1 = intVal.nextInt();
        System.out.println("\033[0;34m" + "\n" + "Entered number: " + intVal1);

        int invers = 0, vsp;
        for (int i = intVal1; i > 0; i /= 10) {
            vsp = i % 10;
            invers = invers * 10 + vsp;
        }
        System.out.println("\033[0;32m" + "\n" + "Inverted number: " + invers);
    }
}
