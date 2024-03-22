package org.mpei.PracticWork_4.Zadacha_1;

public class Main_6 {
//    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };
//        Thread thread1 = new Thread(runnable);
//        thread1.start();
//
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread.currentThread().join();
    }
}
