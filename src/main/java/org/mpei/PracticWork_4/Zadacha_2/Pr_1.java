package org.mpei.PracticWork_4.Zadacha_2;

public class Pr_1 {
    private Object lock = new Object();

    public void smth() {
        synchronized (lock) {
            // критическая секция
        }
    }
}
