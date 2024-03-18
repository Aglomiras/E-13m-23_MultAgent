package org.mpei.PracticWork_4.Zadacha_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Runnable runnable1 = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable1);

        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread2 = new Thread(runnable2);

        long time1 = System.currentTimeMillis();
        System.out.println("Time1: " + (time1 - startTime));

        thread1.start();
        thread2.start();

        long time2 = System.currentTimeMillis();
        thread1.join();
        System.out.println("Time2: " + (time2 - startTime));

        Thread.sleep(10000);
        long time3 = System.currentTimeMillis();
        System.out.println("Time3: " + (time3 - startTime));

    }
}
