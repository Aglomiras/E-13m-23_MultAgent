package org.mpei.PracticWork_4.Zadacha_1;

public class Main_1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Name thread: " + this.getName());
        }
    }
}
