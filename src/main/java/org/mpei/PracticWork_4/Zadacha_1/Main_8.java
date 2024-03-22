package org.mpei.PracticWork_4.Zadacha_1;

public class Main_8 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello, world!");
        };

        Thread thread = new Thread(runnable);
        System.out.println(thread.isAlive());
        thread.start();
    }
}
