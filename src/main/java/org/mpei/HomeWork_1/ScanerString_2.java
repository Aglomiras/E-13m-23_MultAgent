package org.mpei.HomeWork_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScanerString_2 {

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
        char[] masChar = strSpl.toCharArray();
        System.out.println(masChar);

        //Вывод каждой буквы слова с новой строки, а также проверка условия "наличие буквы (а) в слове"
        for (char c : masChar) {
            if (c != 'a') {
                System.out.println("\033[0;32m" + c);
            } else {
                System.out.println("Вывод букв прекращен, так как слово содержит букву (a).");
                break;
            }
        }
    }
}
