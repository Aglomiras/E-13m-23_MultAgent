package org.mpei.PracticWork_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticWork_2 {
    public static void main(String[] args) {
        /**
         * Задача #1:
         * Вам дана некоторая строка.
         * Напишите программу, используя цикл, которая выводит в консоль по очереди все символы с конца строки.
         * Строку необходимо принять из консоли
         * */
        func1();

        /**
         * Задача #2:
         * Напишите программу, которая выводит в консоль все целые числа от 100 до 1.
         * */
        func2();

        /**
         * Задача #3:
         * Напишите программу, которая выводит первые N степеней двойки.
         * */
        func3();

        /**
         * Задача #4:
         * Вам дан массив целых чисел, среди которых содержатся нули.
         * Необходимо написать программу, которая выводит позицию первого нуля в этом массиве
         * */
        func4();

        /**
         * Задача #5:
         * Дано целое N-значное число. Необходимо написать программу,
         * которая будет проверять, содержит ли это число цифру 0.
         * */
        func5();

        /**
         * Задача #6:
         * Дано некоторое целое число. Необходимо написать программу, которая выводит массив цифр этого числа.
         * */
        func6();

        /**
         * Задача #7:
         * Дано два массива. Необходимо написать программу, используя циклы for для
         * объединения этих массивов в один, где в начале стоят элементы первого массива,
         * а после них идут элементы второго
         * */
        func7();

        /**
         * Задача #8:
         * Вам задается строка. Необходимо написать программу по определению, являются ли строка палиндромом
         * */
        func8();

        /**
         * Задача #9:
         * Создайте массив. Заполните массив случайными числами.
         * Определите максимальное, минимальное число в массиве и среднее значение.
         * */
        func9();

        /**
         * Задача #10:
         * Необходимо написать программу для определения времени года.
         * Реализовать ввод через консоль номера месяца, по которому будет определяться название месяца и время года.
         * Определение сезона реализовать через деление на 4 и оператор if.
         * Реализовать повторный ввод если введено неверный номер месяца
         * */
        func10();

        /**
         * Задача #11:
         * Вам необходимо написать программу, реализующую пузырьковую сортировку.
         * Суть сортировки: будем идти по массиву слева направо; если текущий элемент больше следующего,
         * меняем их местами; делаем так, пока массив не будет отсортирован.
         * */
        func11();

        /**
         * Задача #12:
         * Вам дана матрица 3x3 с числами. Необходимо написать программу, используя вложенный цикл,
         * для вывода всех элементов матрицы с новой строки, начиная с первой строки матрицы.
         * */
        func12();

        /**
         * Задача #13:
         * Мы попали в подземелье. У нас нет карты, но есть код (массив) в котором зашифрованы номера дверей,
         * ведущих к выходу. Реализуйте код при помощи цикла for и ветвления if, который проведёт вас до выхода.
         * Ввод номера двери комнаты производится через консоль. В комнатах неуказанных в коде расположить
         * ловушки (в консоль выводится сообщение, например: "вы попали в капкан..."), после чего предлагается перезапуск прохождения.
         * Реализовать наполнение массива "кода" через for и заполнить рандомными целыми числами (Random.nextInt),
         * выбор комнат реализовать через консоль. Рестарт предлагать в случае провала или прохождения подземелья.
         * */
        func13();
    }

    public static void func1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strchar = str.toCharArray();
        for (int i = strchar.length - 1; i >= 0; i--) {
            System.out.println("Символ № " + (i + 1) + ": " + strchar[i]);
        }
    }

    public static void func2() {
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "; ");
        }
    }

    public static void func3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("2 в степени " + i + " = " + Math.pow(2, i));
        }
    }

    public static void func4() {
        System.out.print("\n3) int[] arr = {1,2,3,0,4,5,0}\nВыведите в консоль позицию первого нуля\n");
        int[] arr = {1, 2, 3, 0, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Первый 0 на позиции: " + (i + 1));
                break;
            }
        }
    }

    public static void func5() {
        int num = 1204;
        int ost = 0;
        boolean have0 = false;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            ost = num % 10;
            num /= 10;
            if (ost == 0) {
                have0 = true;
                break;
            }
        }
        if (have0 == true) {
            System.out.println("Число содержит 0");
        } else {
            System.out.println("Число не содержит 0");
        }
    }

    public static void func6() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ost = 0;
        byte[] numbite = new byte[String.valueOf(num).length()];
        for (int i = (String.valueOf(num).length() - 1); i >= 0; i--) {
            ost = num % 10;
            numbite[i] = (byte) ost;
            num /= 10;
        }
        System.out.println("Массив из цифр:");
        System.out.println(Arrays.toString(numbite));
    }

    public static void func7() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arrsumm = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arrsumm[i] = arr1[i];
        }
        for (int i = (arr1.length + arr2.length - 1); i >= arr1.length; i--) {
            arrsumm[i] = arr2[i - 3];
        }
        System.out.print("Объединённый массив: ");
        for (int i = 0; i < arrsumm.length; i++) {
            System.out.print(arrsumm[i] + "; ");
        }
    }

    public static void func8() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] charArr = str.split("");

        boolean flag = true;
        for (int i = 0; i < charArr.length; i++) {
            if (!charArr[i].equals(charArr[charArr.length - 1 - i])) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    public static void func9() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arrDou = new double[n];

        for (int i = 0; i < n; i++) {
            arrDou[i] = Math.random() * 10;
        }
        ;
        double max = arrDou[0];
        double min = arrDou[0];
        double allM = 0;

        for (int i = 0; i < n; i++) {
            if (max < arrDou[i]) {
                max = arrDou[i];
            }
            if (min > arrDou[i]) {
                min = arrDou[i];
            }
            allM += arrDou[i];
        }

        System.out.println(Arrays.toString(arrDou));
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Среднее значение: " + allM / n);
    }

    public static void func10() {
        String[] monthes = {"Январь", "Февраль", "Март", "Апрель", "Мая", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean flag = true;
        while (flag == true) {
            System.out.println("Введите номер нужного вам месяца: ");
            number = scan.nextInt();
            if (number < 1 || number > 12) {
                System.out.println("Неверное введённое значение! Повторите попытку.");
                flag = true;
            } else {
                flag = false;
            }
        }
        double x = (double) number / 4;
        if (x < 0.7 || x == 3) {
            System.out.println("Вы ввели: " + number + "\nЭто " + monthes[number - 1] + ". Время года зима.");
        } else if (x > 0.7 && x <= 1) {
            System.out.println("Вы ввели: " + number + "\nЭто " + monthes[number - 1] + ". Время года весна.");
        } else if (x > 1 && x <= 2) {
            System.out.println("Вы ввели: " + number + "\nЭто " + monthes[number - 1] + ". Время года лето.");
        } else if (x > 2 && x < 3) {
            System.out.println("Вы ввели: " + number + "\nЭто " + monthes[number - 1] + ". Время года осень.");
        }
    }

    public static void func11() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * 10;
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    double val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void func12() {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void func13() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        boolean restart = true;
        while (restart == true) {
            System.out.println("Введите желаемое число этажей: ");
            int countRooms = scanner.nextInt();
            Integer[] rooms = new Integer[countRooms];
            for (int i = 0; i < countRooms; i++) {
                rooms[i] = random.nextInt(10) + 1;
            }
            System.out.println("Секретный код: " + Arrays.toString(rooms));
            for (int j = 0; j < rooms.length; j++) {
                System.out.println("Перед вами 10 дверей. Выберите номер двери в которую хотите войти: ");
                int num = scanner.nextInt();
                if (num == rooms[j]) {
                    System.out.println("Вы выбрали верную комнату!");
                    counter++;
                } else {
                    System.out.println("Вы угодили в ловушку...");
                    break;
                }
            }
            if (counter == rooms.length) {
                System.out.println("Вы прошли подземелье! Поздравляем!");
                restart = false;
            } else {
                boolean f = true;
                while (f) {
                    System.out.println("Желаете попробовать ещё раз?\n 1 - Да. \n 2 - Нет.");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        f = false;
                    } else if (choice == 2) {
                        System.out.println("GAME OVER");
                        f = false;
                        restart = false;
                    } else {
                        System.out.println("Неправильная команда. Повторите попытку.");
                    }
                }
            }
        }
    }
}
