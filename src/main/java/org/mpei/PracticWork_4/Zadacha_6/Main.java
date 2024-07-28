package org.mpei.PracticWork_4.Zadacha_6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable task = () -> {
            System.out.println("Hello");
            Thread.sleep(1000);
            return true;
        };

        FutureTask<Boolean> task1 = new FutureTask<>(task);
        Thread thread1 = new Thread(task1);
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(task1.get());
    }
}
