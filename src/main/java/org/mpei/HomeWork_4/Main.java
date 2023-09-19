package org.mpei.HomeWork_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strOne = scan.nextLine().trim();
        String strTwo = scan.nextLine().trim();

        StringDataValidator stringDataValidator = new StringDataValidator();

        try {
            stringDataValidator.validate(strOne, strTwo);
            System.out.println(stringDataValidator.validate(strOne, strTwo));
        } catch (EmptyDataException e) {
            e.printStackTrace();
            System.err.println("EmptyDataException! Передана строка null или пустая строка.");
        } catch (UnknownCharacterException e) {
            e.printStackTrace();
            System.out.println("UnknownCharacterException! Содержит символы кроме английских и цифр.");
        } finally {
            scan.close();
        }
    }
}
