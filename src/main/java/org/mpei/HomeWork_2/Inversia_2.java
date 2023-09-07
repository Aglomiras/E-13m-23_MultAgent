package org.mpei.HomeWork_2;

import java.util.Scanner;

public class Inversia_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Объявление Scanner
        int A = scanner.nextInt(); //Ввод числа с клавиатуры

        int Vspomog, Invers = 0; //Инициализация переменных
        for (int i = A; i > 0 ; i /= 10) { // (i > 0) - так как деление целочисленное и десятые доли не видны
            /**
             * Кратко, что происходит в цикле
             * Введенное число делят на 10 и находят остаток от деления
             * Остаток от деления формирует первый разряд инверсированного числа
             * (то есть, остаток в введенном числе был самым низшим разрядом, в инверсированном - самым высшим)
             * После формирования разряда, введеное число делят на 10 и отбрасывают десятичные доли
             * Итерация повторяется
             * */
            Vspomog = i % 10; //Получение остатка от деления, для записи инверсированного числа
            Invers = Invers * 10 + Vspomog; //Получение инверсированного числа
        }
        System.out.println(Invers);
    }
}
