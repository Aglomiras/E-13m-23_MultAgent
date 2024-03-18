package org.mpei.PracticWork_4.Zadacha_1;

public class Main_2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Name thread: " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
