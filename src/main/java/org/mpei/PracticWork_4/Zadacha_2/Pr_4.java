package org.mpei.PracticWork_4.Zadacha_2;

public class Pr_4 {
    public class Example {
        public static int getSize() {
            synchronized (Pr_3.Example.class) {
                // критическая секция
                return 0;
            }
        }
    }
}
