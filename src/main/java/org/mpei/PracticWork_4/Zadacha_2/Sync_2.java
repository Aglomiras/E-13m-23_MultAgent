package org.mpei.PracticWork_4.Zadacha_2;

public class Sync_2 {
    public static void main(String []args) throws InterruptedException {
        Object lock = new Object();

        // task будет ждать, пока его не оповестят через lock
        Runnable task = () -> {
            synchronized(lock) {
                try {
                    lock.wait(); //Ждем оповещения
                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread-0");
        };
        Thread taskThread = new Thread(task);
        taskThread.start();

        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        Thread.currentThread().sleep(5000);
        System.out.println("main");
        synchronized(lock) {
            lock.notify(); //Оповещаем
        }
    }
}
