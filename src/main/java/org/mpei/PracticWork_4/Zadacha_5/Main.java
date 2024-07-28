package org.mpei.PracticWork_4.Zadacha_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> arrayList = new LinkedList<>();
        int size = 3;

        Thread prod1 = new Producer(arrayList, size);
        Thread prod2 = new Producer(arrayList, size);
        Thread prod3 = new Producer(arrayList, size);

        Thread cons = new Consumer(arrayList);

        prod1.start();
        prod2.start();
        prod3.start();

        cons.start();
    }
}
