package org.mpei.ClassWork_9;
@Bean(name = "Err")
public class StdErrorPrinter implements Printer {
    @Override
    public void print(String str) {
        System.err.println(str);
    }
}
