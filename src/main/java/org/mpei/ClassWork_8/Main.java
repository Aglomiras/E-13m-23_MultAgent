package org.mpei.ClassWork_8;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.mpei.ClassWork_6.LinkedList.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /**
         * Пример 1. Класс компаратор
         * */
        List<Integer> l = new ArrayList<>(List.of(-2, 5, 1, 10, -8, 6));
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                /**
                 * Данна строка эквивалента закомментированному ниже условию.
                 * */
                return o1 > o2 ? 1 : o1 < o2 ? -1 : 0;

//                if (o1 > o2) {
//                    return 1;
//                } else if (o1 < o2) {
//                    return -1;
//                } else {
//                    return 0;
//                }
            }
        });
        System.out.println(l);

        List<Student> stl = new ArrayList<>(List.of(new Student("Jack", 20),
                new Student("Tom", 18),
                new Student("Carlos", 27),
                new Student("Betty", 22)));

        stl.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? -1 : 1;
            }
        });
        System.out.println(stl);

        stl.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(stl);


        ActiveStudent aS = new ActiveStudent("Tom", 20);
        aS.setAction(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName()+ " i'm sleeping");
            }
        });

        aS.doSomething();
//        aS.setAction(st -> System.out.println(st.getName()+ " i',m studing"+ f.getSort));


        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Jack", "Russel", "rzia", 5, Sex.Man),
                new Employee("Betty", "Simpleton", "tvn", 2, Sex.Wyman),
                new Employee("Marry", "Bloody", "ees", 10, Sex.Wyman),
                new Employee("Tom", "Kapitons", "rzia", 7, Sex.Man),
                new Employee("Crazy", "Bart", "rzia", 1, Sex.Man)
                ));

        /**
         * Данный стрим возвращает людей с фамилией, начинающейся на букву "B" и являющихся мужчиной
         * */
        List<Employee> employees1 = employees.stream()
                .filter(employee -> employee.getSurname().startsWith("B"))
                .filter(employee -> employee.getSex() == Sex.Man)
                .toList();
        System.out.println(employees1);

        /**
         * Данный стрим возвращает людей, которые являются женщинами и работают на кафедре "ees
         * "*/
        List<Employee> employees2 = employees.stream()
                .filter(e -> e.getSex() == Sex.Wyman && e.getDepartament().equals("ees"))
                .toList();
        System.out.println(employees2);

        /**
         * Данный стрим возвращает...*/
        List<String> employees3 = employees.stream()
                .filter(e -> e.getExperienc() > 3)
                .map(employee -> employee.getDepartament())
                .distinct()
                .toList();
        System.out.println(employees3);

        /**
         * Данный стрим возвращает средний возраст сотрудников мужского пола
         * */
        double asDobl = employees.stream()
                .filter(e -> e.getSex() == Sex.Man)
                .mapToDouble(employe -> employe.getExperienc())
                .average().getAsDouble();
        System.out.println(asDobl);

        /**
         * Данный стрим возвращает сумму стажа, трех самых молодых сотрудников
         * */
        double sumE = employees.stream()
                .sorted((o1, o2) -> o1.getExperienc() < o2.getExperienc() ? -1 : 1)
                .limit(3)
                .mapToDouble(e -> e.getExperienc())
                .sum();
        System.out.println(sumE);

        /**
         *Данный стрим возвращает любую (рандомную) женщину из всех сотрудников */
        Optional<Employee> employees4 = employees.stream()
                .filter(e -> e.getSex() == Sex.Wyman)
                .findAny();
        System.out.println(employees4);

        /**
         * Данный стрим возвращает самую опытную женщину из всех сотрудников*/
        Optional<Employee> employees5 = employees.stream()
                .filter(e -> e.getSex() == Sex.Wyman)
                .sorted((o1, o2) -> o1.getExperienc() > o2.getExperienc() ? -1 : 1)
                .findAny();
        System.out.println(employees5);
    }
}
