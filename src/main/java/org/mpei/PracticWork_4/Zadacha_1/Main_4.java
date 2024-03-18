package org.mpei.PracticWork_4.Zadacha_1;

public class Main_4 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
          for (int i = 0; i < 10; i++) {
              System.out.println(i);
//              System.out.println("getState: " + Thread.currentThread().getState());
          }
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("getName: " + thread.getName());
        System.out.println("getState: " + thread.getState());
        System.out.println("getThreadGroup: " + thread.getThreadGroup());
        System.out.println("getClass: " + thread.getClass().getName());

        Thread.sleep(1000);

        System.out.println("getName: " + Thread.currentThread().getName());
        System.out.println("getState: " + Thread.currentThread().getState());
        System.out.println("getThreadGroup: " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("getClass: " + Thread.currentThread().getClass().getName());
    }
}
