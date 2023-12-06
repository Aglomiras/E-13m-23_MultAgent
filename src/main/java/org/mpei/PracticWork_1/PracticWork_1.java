package org.mpei.PracticWork_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PracticWork_1 {
    public static void main(String[] args) {
        /**
         * Задача #1:
         * Даны два целых числа. Необходимо проверить, что первое число без остатка делится на второе число
         * */
        int first = 10; //Первое число
        int second = 2; //Второе число
        if (first % second == 0) {
            System.out.println("Делится без остатка!");
        } else {
            System.out.println("Не делится без остатка!");
        }

        /**
         * Задача #2:
         * У вас есть в кармане 50 рублей на покупку мороженного.
         * Но в магазине множество видов мороженного с разной ценой. Необходимо написать программу,
         * которая будет принимать на вход цену мороженного и сравнивать эту цену с имеющейся у вас суммой денег.
         * Если денег на покупку хватает, то необходимо вывести в консоль «Yes», в противном случае «No»
         * */
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if (price <= 50) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /**
         * Задача #3:
         * Продавец магазина техники решил предоставлять подарочную карту покупателям, совершившим покупки
         * на сумму более 30000 рублей. Кроме того, клиенты, общая сумма покупок которых превышает 60000 рублей,
         * получат дополнительно скидочную карту. Необходимо написать программу, которая будет принимать
         * сумму покупки в качестве входных данных и выводит «Получена подарочная карта»,
         * если сумма выше 30000 рублей и «Получена скидочная карта», если сумма выше 60000 рублей
         * */
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();
        if (purchases > 30000) {
            System.out.println("Получена подарочная карта");
            if (purchases > 60000) {
                System.out.println("Получена скидочная карта");
            }
        }

        /**
         * Задача #4:
         * Дано дробное число, содержащее количество гигабайт: float gb = 30,4.
         * Необходимо написать программу, которая выведет в консоль это значение в мегабайтах, килобайтах и байтах.
         * */
        float gb = 30.4f; // Гигабайт
        float mb = gb * 10E2f;
        float kb = gb * 10E5f;
        float bt = gb * 10E8f;
        System.out.println(gb + " гигабайт это:");
        System.out.println("Мегабайт:" + mb + "\nКилобайт:" + kb + "\nБайт:" + bt);

        /**
         * Задача #5:
         * Необходимо написать программу определения площади треугольника по целочисленным
         * координатам его вершин (x1;y1), (x2;y2) и (x3;y3).
         * Входными параметрами является ввод координат вершин треугольника через запятую.
         * */
        Scanner scanner1 = new Scanner(System.in);
        String str1 = scanner1.nextLine();
        String str2 = scanner1.nextLine();
        String str3 = scanner1.nextLine();

        String[] strArr1 = str1.split(",");
        String[] strArr2 = str2.split(",");
        String[] strArr3 = str3.split(",");

        double treygAX = Double.parseDouble(strArr1[0]) - Double.parseDouble(strArr2[0]);
        double treygAY = Double.parseDouble(strArr1[1]) - Double.parseDouble(strArr2[1]);
        double treygBX = Double.parseDouble(strArr2[0]) - Double.parseDouble(strArr3[0]);
        double treygBY = Double.parseDouble(strArr2[1]) - Double.parseDouble(strArr3[1]);
        double treygCX = Double.parseDouble(strArr3[0]) - Double.parseDouble(strArr1[0]);
        double treygCY = Double.parseDouble(strArr3[1]) - Double.parseDouble(strArr1[1]);

        double treA = Math.sqrt(treygAX * treygAX + treygAY * treygAY);
        double treB = Math.sqrt(treygBX * treygBX + treygBY * treygBY);
        double treC = Math.sqrt(treygCX * treygCX + treygCY * treygCY);
        double treP = (treA + treB + treC) / 2;

        System.out.print("Площадь треугольника: ");
        System.out.println(Math.sqrt(treP * (treP - treA) * (treP - treB) * (treP - treC)));
    }

    /**
     * Вариант 1, задание 1:
     * Создайте программу, принимающую на вход значение температуры в градусах
     * и выводящую в консоль значение температуры в фаренгейтах
     */
    public void variant1_1() {
        Scanner scanner = new Scanner(System.in);
        double cel = scanner.nextDouble();
        double far = cel * 1.8 + 32;
        System.out.println(cel + " градусов = " + far + " фаренгейт");
    }

    /**
     * Вариант 1, задание 2:
     * Создайте программу, которая принимает на вход строку и проверяет ее,
     * читается ли она одинаково с двух сторон, используя встроенную функцию.
     * В консоль должно выводиться либо true, либо false.
     */
    public void variant1_2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversSb = sb.toString();
        if (str.equals(reversSb)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Вариант 1, задание 3:
     * Создайте программу, которая принимает на вход строку, переводит ее в тип int и прибавляет к ней 50,
     * а консоль выводит результат этого преобразования и тип переведенного значения.
     */
    public void variant1_3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int val = Integer.parseInt(str);
        System.out.println(val + 50);
        System.out.println("Тип преобразованного значения: " + ((Object) val).getClass());

    }

    /**
     * Вариант 2, задание 1:
     * Создайте программу, принимающую на вход число дней и выводящую в консоль число секунд в этом количестве дней.
     */
    public void variant2_1() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        long sec = day * 24 * 60 * 60;
        System.out.println(day + " дней содержит " + sec + " секунд");
    }

    /**
     * Вариант 2, задание 2:
     * Создайте программу, которая принимает на вход две строки
     * и проверяет, содержат ли они цифры. Если обе строки содержат цифры,
     * то необходимо вывести true, иначе false.
     */
    public void variant2_2() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (Pattern.matches(".*\\d.*", str1) && Pattern.matches(".*\\d.*", str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Вариант 2, задание 3:
     * Создайте программу, которая принимает на вход число с плавающей точкой и
     * переводит его в строковый тип и складывает со строкой “Высота”.
     * В консоль необходимо вывести образованную новую строку и тип преобразованного значения.
     */
    public void variant2_3() {
        Scanner scanner = new Scanner(System.in);
        double val = scanner.nextFloat();

        String str = String.valueOf(val);
        System.out.println("Высота " + str);
        System.out.println(((Object) str).getClass());
    }

    /**
     * Вариант 3, задание 1:
     * Создайте программу, принимающую на вход число миль в час и
     * выводящую в консоль соответствующую скорость в километрах в час.
     */
    public void variant3_1() {
        Scanner scanner = new Scanner(System.in);
        double mil = scanner.nextDouble();
        double km = mil * 1.61;
        System.out.println(mil + " миль/ч = " + km + " км/ч");
    }

    /**
     * Вариант 3, задание 2:
     * Создайте программу, которая принимает на вход число и проверяет больше ли оно 50 или нет.
     * Если оно больше 50 необходимо проверить меньше ли оно 60. Если число меньше 50,
     * то необходимо проверить больше ли оно 40. В консоль необходимо вывести соответствующее сообщение.
     */
    public void variant3_2() {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        if (val > 50) {
            if (val < 60) {
                System.out.println("Число больше 50, но меньше 60");
            } else {
                System.out.println("Число больше 60");
            }
        } else {
            if (val > 40) {
                System.out.println("Число меньше 50, но больше 40");
            } else {
                System.out.println("Число меньше 40");
            }
        }
    }

    /**
     * Вариант 3, задание 3:
     * Создайте программу, которая принимает число в виде строки, переводит его в целочисленный
     * тип и складывает с числом 4,7. Выведите в консоль результат и тип преобразованного числа и тип результата.
     */
    public void variant3_3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int val = Integer.parseInt(str);
        double val1 = 4.7;
        System.out.println(val + val1 + " " + ((Object) (val + val1)).getClass());
        System.out.println(((Object) val).getClass());
    }
}
