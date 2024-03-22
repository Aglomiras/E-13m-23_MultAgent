package org.mpei.PracticWork_4.Zadacha_1;

public class Practic_1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getThreadGroup());
            System.out.println(Thread.currentThread().isAlive());
        };
        Thread task1 = new Thread(runnable);
        MyThread task2 = new MyThread();
        task1.start();
        task2.start();

    }
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getThreadGroup());
            System.out.println(Thread.currentThread().isAlive());
        }
    }
}
