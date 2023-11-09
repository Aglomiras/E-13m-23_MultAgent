package org.mpei.ClassWork_15;

import lombok.Data;

@Data
public class Count {
    int Sum = 0;

    public synchronized void increment() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is working " + Sum);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Sum++;
    }
}
