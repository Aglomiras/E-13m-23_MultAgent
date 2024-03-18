package org.mpei.PracticWork_4.Zadacha_1;

public class Main_3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Name thread: " + Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
