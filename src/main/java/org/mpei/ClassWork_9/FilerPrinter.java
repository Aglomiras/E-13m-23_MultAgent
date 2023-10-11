package org.mpei.ClassWork_9;

import lombok.SneakyThrows;

import java.io.File;
import java.io.PrintWriter;

@Bean(name = "File")
public class FilerPrinter implements Printer {
    @Override
    @SneakyThrows
    public void print(String str) {
        PrintWriter out = new PrintWriter("filename");
        out.print(str);
        out.close();
//        System.out.println(str);
//        System.err.println(str);
    }
}
