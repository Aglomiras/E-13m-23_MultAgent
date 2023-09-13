package org.mpei.HomeWork_3.Version_2;

import org.mpei.HomeWork_3.Version_2.Converters.Type;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CurencyMain {
    public static void main(String[] args) {

        Scanner gold = new Scanner(System.in);
        System.out.println("How much money do you have? " +
                "Enter the amount to the nearest hundredths: "); //Сколько у вас средств? Введите сумму с точностью до сотых:

        while (!gold.hasNextDouble()) {
            System.out.println("Incorrect input! Try again."); //Некорректный ввод! Попробуйте еще раз.
            gold.next();
        }
        double goldMy = gold.nextDouble();

        System.out.print("\033[0;31m" + "What currency do you keep your FUNDS IN? "); //В какой валюте вы храните средства?
        Type inputMy = dataVerification();

        System.out.print("\033[0;31m" + "What currency do you want to TRANSFER TO? "); //В какую валюты вы хотите перевести?
        Type outputMy = dataVerification();

        Exchanger exchanger = new Exchanger();
        exchanger.convert(goldMy, inputMy, outputMy);
    }

    public static Type dataVerification() {
        System.out.println("\033[0;34m" + "Enter the appropriate English name: " + "\n" //Введите соответствующее английское название:
                + "Rub - Рубли;" + "\n" + "Dollar - Доллары;" + "\n" + "Yen - Йены;" + "\n" + "Yuan - Юани;");

        Scanner gold = new Scanner(System.in);
        boolean flag = false;
        Type putMy = null;

        Type[] arrayType = new Type[] {Type.Dollar, Type.Yen, Type.Yuan, Type.Rub};

        while (!flag) {
            String text = gold.nextLine();
            if (Pattern.matches("[a-zA-Z]+", text)) {
                flag = true;

                for (int i = 0; i < arrayType.length; i++) {
                    if (arrayType[i].toString().equals(text)) {
                        putMy = arrayType[i];
                    }
                }
                if (putMy == null) {
                    System.out.println("There is no converter for this currency. " + //Нет конвертера для данной валюты.
                            "You may have entered it incorrectly. " + //Возможно вы ввели ее неправильно.
                            "Try again:"); //Попробуйте еще раз:
                    flag = false;
                }
            } else {
                System.out.println("The string contains numbers or incorrect characters! " +
                        "Enter the word again: "); //Строка содержит цифры или некорретные знаки! Введите слово еще раз:
                flag = false;
            }
        }
        return putMy;
    }
}
