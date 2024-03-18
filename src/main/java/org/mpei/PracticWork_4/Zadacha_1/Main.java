package org.mpei.PracticWork_4.Zadacha_1;

public class Main {
    public static void main(String[] args) {

        Thread trs = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        trs.start();

    }
}
