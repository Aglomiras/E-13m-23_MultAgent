package org.mpei.PracticWork_4.Zadacha_1;

public class Practic_2 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            System.out.println("Name: " + Thread.currentThread().getName());
        };

        Thread task1 = new Thread(runnable1);
        Thread task2 = new Thread(runnable1);
        task1.start();
        task1.interrupt();

        boolean flg = true;

        while (flg) {
            if (task1.isInterrupted()) {
                task2.start();
                flg = false;
            }
        }
    }
}
