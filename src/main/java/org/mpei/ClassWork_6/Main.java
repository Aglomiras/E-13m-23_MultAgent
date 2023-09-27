package org.mpei.ClassWork_6;

import org.mpei.ClassWork_1.PracticZad_4.Student;

public class Main {
    public static void main(String[] args) {
        MyOptional<String> myOptional = new MyOptional();
        myOptional.setObject("newValue");

        String s = myOptional.getObject();

        MyOptional<Student> studenVal = new MyOptional<>();
        studenVal.setObject(new Student("St", 2));

        Student student = studenVal.getObject();
    }
}
