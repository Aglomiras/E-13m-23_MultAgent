package org.mpei.PracticWork_4.Zadacha_2;

public class Sync_3 {
    public static void main(String[] args) throws InterruptedException {
        Point point = new Point();
        Thread task1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {

            }
            if (point.getVal() == 0) {
                point.message();
                System.out.println(Thread.currentThread().getName() + " Win!");
            } else {
                System.out.println(Thread.currentThread().getName() + " Lose!");
            }

        });
        Thread task2 = new Thread(() -> {
            if (point.getVal() == 0) {
                point.message();
                System.out.println(Thread.currentThread().getName() + " Win!");
            } else {
                System.out.println(Thread.currentThread().getName() + " Lose!");
            }

        });
        task1.start();
        task2.start();
    }
    public static class Point {
        private int val = 0;

        public synchronized int getVal() {
            return val;
        }

        public synchronized void message(){
            val = 1;
        }
    }
}
