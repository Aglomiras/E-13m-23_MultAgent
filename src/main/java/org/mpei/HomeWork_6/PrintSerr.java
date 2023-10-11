package org.mpei.HomeWork_6;

public class PrintSerr implements Call {
    @Override
    @AutoCallable
    public void printText(String text) {
        System.err.println(text);
    }
}
