package org.mpei.PracticWork_4.Zadacha_1;

public class Main_5 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Name thred: " + Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);
        thread.start();


//        int i = 0;
//        while (i<150){
//            System.out.println("Статус: " + thread.getState());
//            i++;
//        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
