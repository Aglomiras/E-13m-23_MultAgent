package org.mpei.HomeWork_3;

import org.mpei.HomeWork_3.Converters.CurencyYenToRub;
import org.mpei.HomeWork_3.Converters.Type;

import java.util.Scanner;

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

        System.out.print("\033[0;31m" + "What currency do you keep your funds in? "); //В какой валюте вы храните средства?
        System.out.println("\033[0;31m" + "Enter the appropriate English name: " + "\n" //Введите соответствующее английское название:
                + "Rub - Рубли;" + "\n"
                + "Dollar - Доллары;" + "\n"
                + "Yen - Йены;" + "\n"
                + "Yuan - Юани;");
        String input = gold.next();

        Type inputMy;
        if (Type.Dollar.toString().equals(input)) {
            inputMy = Type.Dollar;
        } else if (Type.Yen.toString().equals(input)) {
            inputMy = Type.Yen;
        } else if (Type.Yuan.toString().equals(input)){
            inputMy = Type.Yuan;
        } else {
            inputMy = Type.Rub;
        }

        System.out.print("\033[0;34m" + "What currency do you want to transfer to? "); //В какую валюты вы хотите перевести?
        System.out.println("\033[0;34m" + "Enter the appropriate English name: " + "\n" //Введите соответствующее английское название:
                + "Rub - Рубли;" + "\n"
                + "Dollar - Доллары;" + "\n"
                + "Yen - Йены;" + "\n"
                + "Yuan - Юани;");
        String output = gold.next();

        Type outputMy;
        if (Type.Dollar.toString().equals(output)) {
            outputMy = Type.Dollar;
        } else if (Type.Yen.toString().equals(output)) {
            outputMy = Type.Yen;
        } else if (Type.Yuan.toString().equals(output)){
            outputMy = Type.Yuan;
        } else {
            outputMy = Type.Rub;
        }

        Exchanger exchanger = new Exchanger();
        exchanger.convert(goldMy, inputMy, outputMy);
    }
}
