package org.mpei.HomeWork_5.BinarWood;

public class Main {
    public static void main(String[] args) {
        MyBinaryWood myBinaryWood = new MyBinaryWood();
        myBinaryWood.find(0);
        myBinaryWood.find(1);
        myBinaryWood.find(10);

        myBinaryWood.add(8);
        myBinaryWood.add(10);
        myBinaryWood.add(9);
        myBinaryWood.add(11);
        myBinaryWood.add(12);
        myBinaryWood.add(13);
        myBinaryWood.add(14);
        System.out.println();
        myBinaryWood.find(9);
        System.out.println();
        myBinaryWood.find(8);
        System.out.println();
        System.out.println(myBinaryWood.size());
        System.out.println();
        myBinaryWood.find(14);
        myBinaryWood.remove(14);
        myBinaryWood.find(14);

    }
}
