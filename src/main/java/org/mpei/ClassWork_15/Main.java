package org.mpei.ClassWork_15;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Hello from Thread " + Thread.currentThread());
//        MyCalculationThread t1 = new MyCalculationThread();
//        t1.start();
        Thread.sleep(5000);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from Thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        });
        thread.setName("Dummy-thread");
        thread.start();

        Thread.sleep(2000);
        thread.interrupt();

        System.out.println("Finish " + Thread.currentThread().getName());
    }
}
