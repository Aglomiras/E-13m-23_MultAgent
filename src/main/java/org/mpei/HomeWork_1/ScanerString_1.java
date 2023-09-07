package org.mpei.HomeWork_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScanerString_1 {

    public static void main(String[] args) {

        /**
         * - Задано слово String. Вывести каждую букву этого слова с новой строки.
         * Если в слове есть буква "а" - прекратить вывод букв, "а" не должно быть выведено.
         */

        //Создание сканера и вспомогательных переменных
        Scanner strScan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String strSpl = "";
        boolean flag = false;

        //Проверка вводимого из консоли слова на корректность данных
        while (flag == false) {
            String text = strScan.nextLine(); //Ввод слова
            if (Pattern.matches("[a-zA-Z]+", text)) {
                System.out.println("Спасибо! Введено слово: ");
                strSpl = text.toString();
                flag = true;
            } else {
                System.out.println("Строка содержит цифры или некорретные знаки! Введите слово еще раз: ");
                flag = false;
            }
        }

        //Преобразование введенного слова в массив элементов, где каждый символ слова это отдельный элемент
        String[] masChar = strSpl.split("(?!^)");
        System.out.println(Arrays.toString(masChar));

        //Вывод каждой буквы слова с новой строки, а также проверка условия "наличие буквы (а) в слове"
        for (int i = 0; i < masChar.length; i++) {
            if (!masChar[i].equals("a")) { //Использование метода equals
                System.out.println("\033[0;32m" + masChar[i]);
            } else {
                System.out.println("Вывод букв прекращен, так как слово содержит букву (a).");
                break; //Прекращение вывода букв
            }
        }
    }
}