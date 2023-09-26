package org.mpei.ClassWork_5;

import java.util.ArrayList;
import java.util.List;

public class CollectionLecture {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();

        l.add("First String");
        l.add("Second String");
        l.remove("Second String");
        boolean empty = l.isEmpty();
        boolean contt = l.contains("Second String");
        String s = l.get(0);

        int firdt = l.indexOf("First String");
        System.out.println(firdt);


    }
}
