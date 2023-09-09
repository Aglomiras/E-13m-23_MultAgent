package org.mpei.HomeWork_3;

import org.mpei.HomeWork_3.Convercers.CurencyYen_Rub;
import org.mpei.HomeWork_3.Convercers.Type;

import java.util.Scanner;

public class CurencyMain {
    public static void main(String[] args) {
        CurencyYen_Rub curencyYen = new CurencyYen_Rub();
        System.out.println(curencyYen.getTitl());
        System.out.println(curencyYen.convertToCurency(14568));

        Scanner gold = new Scanner(System.in);
        double goldMy = gold.nextDouble();

        System.out.print("\033[0;31m" + "Из какой валюты вы хотите перевести? ");
        System.out.println("\033[0;31m" + "Выберите соответствующее английское название: " + "\n"
                + "Rub - Рубли;" + "\n"
                + "Dollar - Доллары;" + "\n"
                + "Yen - Йены;" + "\n"
                + "Yuan - Юани;");
        String input = gold.next();

        System.out.print("\033[0;34m" + "В какую валюты вы хотите перевести? ");
        System.out.println("\033[0;34m" + "Выберите соответствующее английское название: " + "\n"
                + "Rub - Рубли;" + "\n"
                + "Dollar - Доллары;" + "\n"
                + "Yen - Йены;" + "\n"
                + "Yuan - Юани;");
        String output = gold.next();

        Exchanger exchanger = new Exchanger();
        exchanger.convert(goldMy, input, output);
    }
}
