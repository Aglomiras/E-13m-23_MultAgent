package org.mpei.PracticWork_4.Zadacha_2;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(Thread.currentThread().getName());
//        thread.run();
    }
}
