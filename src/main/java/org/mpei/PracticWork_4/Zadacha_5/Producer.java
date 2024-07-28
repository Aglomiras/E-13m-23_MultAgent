package org.mpei.PracticWork_4.Zadacha_5;

import java.util.Queue;

public class Producer extends Thread {
    private final Queue<Double> queue;
    private final int size;

    public Producer(Queue<Double> queue, int size) {
        this.queue = queue;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer: " + Thread.currentThread().getName() + " " + prod());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double prod() throws InterruptedException {
        synchronized (queue) {
            if (queue.size() == size) {
                queue.wait();
                System.out.println("Жду! " + Thread.currentThread().getName());
            }
            double val = Math.random();
            queue.add(val);
            queue.notifyAll();

            return val;
        }
    }
}
