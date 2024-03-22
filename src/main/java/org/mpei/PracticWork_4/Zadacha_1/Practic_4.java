package org.mpei.PracticWork_4.Zadacha_1;

public class Practic_4 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Practic_4 test = new Practic_4();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + test.getCount());

    }
}
