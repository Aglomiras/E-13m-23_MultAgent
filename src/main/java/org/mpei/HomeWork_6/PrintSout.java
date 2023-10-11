package org.mpei.HomeWork_6;

public class PrintSout implements Call {
    @Override
    @AutoCallable
    public void printText(String text) {
        System.out.println(text);
    }
}
