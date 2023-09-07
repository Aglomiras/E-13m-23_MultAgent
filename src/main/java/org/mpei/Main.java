package org.mpei;

//Рогозинников Евгений Игоревич
//Э-13м-23
/**
 * ЛЕКЦИЯ 1 - ОЗНАКОМИТЕЛЬНАЯ
 * Типы данных*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        byte rei = 127;
//        System.out.println(rei);
//        rei = -20;
//        System.out.println(rei);

        int ppp = 150;
        if (ppp > 150) {
            System.out.println("ppp > 150");
        } else if (ppp < 150){
            System.out.println("ppp < 150");
        } else {
            System.out.println("ppp = 150");
        }
        int sosu = 100;
        switch (sosu){
            case 150:
                System.out.println("150");
                break;
            case 200:
                System.out.println("200");
                break;
            case 100:
                System.out.println("100");
                break;
            default:
                System.out.println("switch = default");
                break;
        }
    }
}