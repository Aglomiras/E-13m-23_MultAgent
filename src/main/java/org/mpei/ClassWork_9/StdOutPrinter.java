package org.mpei.ClassWork_9;

@Bean
public class StdOutPrinter implements  Printer {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
