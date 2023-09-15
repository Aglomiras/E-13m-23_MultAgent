package org.mpei.ClassWork_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
//        double res = Main.devide(10, 0);

        /* int[] arr = {2, 5, 6, 3};
        for (int i = 0; i <= arr.length; i++) { //Выдаст Exceptions
            System.out.println(arr[i]);
        }*/

//        int denominator = 100;
//        try {
//            double res = Main.devide(10, denominator);
//            System.out.println("all ok");
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace();
//        } catch (RuntimeException re) {
//            re.printStackTrace();
//            System.err.println("Ай Ай Ай");
//        }
//        System.out.println("im here");

//        try {
//            myComm();
//            System.out.println("try");
//        } catch (SQLException sq) {
//            sq.printStackTrace();
//            System.out.println("catch");
//            throw new RuntimeException(sq);
//        } finally {
//            System.out.println("finally");
//        }

        Scanner s = null;
        try {
            s = new Scanner(new File("src/main/resources/cfg.txt"));
            while (s.hasNextLine()) {
                String str = s.next();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    public static double devide(int num, int denom) throws NullPointerException, ArithmeticException {
        if (denom == 100) {
            throw new RuntimeException("can not devide on 100");
        }
        return num / denom;
    }
    public static void myComm() throws SQLException {
        throw new SQLException("Bad SQL mfuka");
    }
    public static void myComm2() throws SQLException {
        throw new SQLException("Bad SQL mfuka2");
    }

    /**
     * Проверяемое (Check Exceptions) исключение - обязательно обработать это исключение (компилятор заставит).
     * Такие исключения необходимо обязательно обернуть во что-то.
     * Непроверяемые (Uncheck Exceptions) исключения - не обрабатываются, их не надо оборачивать во что-то.
     *
     * Для поимки исключений, можно указать отдельно каждое через свой catch.
     * В catch пишется то, как надо реагировать на ошибку.*/

    //Создание своих Exceptions

}
