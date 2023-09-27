package org.mpei.ClassWork_6.LinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<String> mira = new MyLinkedList<>();
//        mira.add("string_1");
//        mira.add("string_2");
//        mira.add("string_3");
//
//        printAll(mira);

        /**
         * MyLinkedList<?> list - означает, что пока не известно, какой тип сюда придет,
         * поэтому ожидаем любой тип и работаем с ним как с объектом*/

//    public static void printAll(MyLinkedList<?> list) {
//        System.out.println("---------------");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

        List<Student> stu = new MyLinkedList<>();
        stu.add(new Student("name1", 2));
        stu.add(new Student("name2", 4));
        printAll(stu);


    }
    public static void printAll(List<? extends Student> list) {
        System.out.println("---------------");
        double averAge = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            Student student = list.get(i);
            averAge += student.getAge();
        }
        averAge /= list.size();
        System.out.println("averAge " + averAge);
    }

//    public static void sortStudent(List<? extends Student> list) {
//
//    }
//
//    public static <? extends Student> void sort(List<T> list) {
//
//    }
}
