package org.mpei.HomeWork_2;

import java.util.Scanner;

public class PyzirkSort_2 {
    public static void main(String[] args) {
        /*
        Создадим блок, для ввода количества элементов массива и сами элементы массива через клавиатуры
        * (таким образом задача будет сделана намного универсальнее)
        */

        Scanner Vvod = new Scanner(System.in); //Объявляем Scanner
        /* Выводем сообщение для пользователя, чтобы он ввел количество элементов в массиве */
        System.out.println("Enter array lenght: ");
        int size = Vvod.nextInt(); //Считывание введеных данных о числе элементов в массиве
        int array[] = new int[size]; //Создание пустого массива с числом элементов, которое указал пользователь
        System.out.println("Insert array lenght"); //Вывод сообщения о том, что нужно ввести все элементы массива

        for (int i = 0; i < size; i++) { //Цикл для ввода всех элементов массива с клавиатуры
            array[i] = Vvod.nextInt();
        }

        System.out.println("Elements array: "); //Вывод сообщения "Все элементы массива"
        for (int i = 0; i < size; i++) { //Цикл для вывода на экран введенного с клавиатуры массива
            System.out.print(array[i] + " "); //Вывод всех элементов массива в одну строку
        }
        System.out.println(); //Отступ

        /*Пузырьковый метод для сортировки массива по возрастанию*/
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int zamena = array[j];
                    array[j] = array[i];
                    array[i] = zamena;
                }
            }
        }

        System.out.println("Proverka sortirovki"); //Вывод сообщения для проверки правильности сортировки
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " "); //Вывод массива в столбец
        }

        double rez; //Инициализация переменной, которая обозначает медиану массива
        /*
        Ниже производится проверка количества элементов в массиве. Если в массиве четное количество элементов
        * то медианой массива будет являться среднее арифметическое двух средних элементов массива.
        * Если количество элементов в массиве нечетное, то медианой будет являться элемент, стоящий по середине
        * */

        if (size % 2 == 0) { //Проверка на четность
            System.out.println("Colichestvo elements array chetnoe");
            rez = (double) (array[(size / 2) - 1] + array[(size / 2 + 1) - 1]) / 2; //Вывод ср. арифм. двух средних элементов массива
        } else { //Если количество элементов в массиве нечетное
            System.out.println("Colichestvo elements array NEchetnoe");
            rez = array[(size / 2 + 1) - 1]; //Вывод среднего элемента в массиве
        }

        System.out.println("Mediana: " + rez); //Вывод значения медианы массива
    }
}
