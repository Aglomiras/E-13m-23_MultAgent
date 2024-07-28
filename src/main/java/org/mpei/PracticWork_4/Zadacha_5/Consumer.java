package org.mpei.PracticWork_4.Zadacha_5;

import java.util.Queue;

public class Consumer extends Thread {
    private final Queue<Double> queue;

    public Consumer(Queue<Double> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer: " + Thread.currentThread().getName() + " " + cons());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Double cons() throws InterruptedException {
        synchronized(queue) {
            if (queue.isEmpty()) {
                queue.wait();
                System.out.println("Пусто!");
            }
            queue.notifyAll();

            return queue.poll();
        }

    }
}
