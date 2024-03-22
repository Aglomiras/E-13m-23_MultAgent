package org.mpei.PracticWork_4.Zadacha_2;

public class Sync_4 {
    public static void main(String[] args) {
        Point point = new Point();

        Thread task1 = new Thread(() -> {
            int summ = 0;
            for (int i = 1; i <= 100; i++) {
                summ = summ + i;
            }
            point.creSumm(summ);
        });
        Thread task2 = new Thread(() -> {
            int summ = 0;
            for (int i = 1; i <= 100; i++) {
                summ = summ + 100 + i;
            }
            point.creSumm(summ);
        });
        Thread task3 = new Thread(() -> {
            int summ = 0;
            for (int i = 1; i <= 100; i++) {
                summ = summ + 200 + i;
            }
            point.creSumm(summ);
        });
        task1.start();
        task2.start();
        task3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Общая сумма: " + point.getVal());
    }
    public static class Point {
        private int val;

        public int getVal() {
            return val;
        }

        public synchronized void creSumm(int a) {
            val = val + a;
        }
    }
}
