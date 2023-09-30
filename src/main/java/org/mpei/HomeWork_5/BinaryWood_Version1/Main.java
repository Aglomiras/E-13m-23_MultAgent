package org.mpei.HomeWork_5.BinaryWood_Version1;

public class Main {
    public static void main(String[] args) {
        MyTreeWood<Integer> myBinaryWood = new MyTreeWood<>();
        myBinaryWood.find(0);
        myBinaryWood.find(1);
        myBinaryWood.find(10);

        myBinaryWood.addd(8);
        myBinaryWood.addd(10);
        myBinaryWood.addd(9);
        myBinaryWood.addd(11);
        myBinaryWood.addd(12);
        myBinaryWood.addd(13);
        myBinaryWood.addd(14);
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
