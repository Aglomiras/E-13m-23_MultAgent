package org.mpei.HomeWork_5.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedListEl<Integer> list = new MyLinkedListEl<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list.get(2));
        System.out.println(list.size());
        printList(list);
        list.remove(0);
        System.out.println();
        printList(list);
    }

    public static void printList(MyLinkedListEl<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
