package org.mpei.ClassWork_1.PracticZad_4;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 23);
        st1.setGroup("e-13m-23");
        Student st2 = new Student("Ivan", 23);
        st2.setGroup("e-13m-22");
        System.out.println(st1.equals(st2));
        Student st3 = st2;

        st2.getClass();
    }
}
