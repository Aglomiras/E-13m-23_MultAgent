package org.mpei.PracticWork_4.Zadacha_1;

import java.util.concurrent.TimeUnit;

public class Main_7 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();;
        thread.interrupt();
    }
}
