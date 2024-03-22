package org.mpei.ProjectWork_1;

import java.util.Scanner;

public class Leveling {
    public static void main(String[] args) {
        double expSumm = 0;
        double exp = 100;
        double modif = 1.1;

        Scanner intScan = new Scanner(System.in);
        int lvl = intScan.nextInt();

        for (int i = 0; i < lvl; i++) {
            exp = exp * modif;
            expSumm = expSumm + exp;
        }

        System.out.println("expSumm: " + expSumm);
        System.out.println("exp: " + exp);
        System.out.println("modif: " + modif);
    }
}
