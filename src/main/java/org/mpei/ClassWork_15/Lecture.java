package org.mpei.ClassWork_15;

import lombok.SneakyThrows;

public class Lecture {
    /**
     * Daemon - поток, которого не ждут.
     * java -приложеие не ждет, когда завершится поток Daemon
     */
    @SneakyThrows
    public static void main(String[] args) {

        Count t = new Count();
//        Count c = new Count();
        Thread thread = new Thread(() -> {
            for (int j = 0; j < 10_000; j++) {
//                t.setSum(t.getSum() + 1);
                t.increment();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int j = 0; j < 10_000; j++) {
//               t.setSum(t.getSum() + 1);
//               c.setSum(c.getSum() + 1);
                t.increment();
            }
        });

        thread.start();
        thread1.start();
        Thread.sleep(5000);

        System.out.println(t.getSum());
//        System.out.println(t.getSum() + c.getSum());

        /**
         * Почему вместо ожидаемыъ 20000 результат программы выводит ерунду???
         * - Потоки работают изолированно друг от друга;
         * - Ресурсы между потоками распределяются;
         * */

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            long start = System.currentTimeMillis();

            @Override
            public void run() {
                System.out.println(System.currentTimeMillis() - start);
            }
        }));

        /**
         * Блок синхронайз необходимо использовать мало и аккуратно
         * */
    }
}
