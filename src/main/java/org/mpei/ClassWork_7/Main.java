package org.mpei.ClassWork_7;

import org.mpei.ClassWork_6.LinkedList.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();

        /**
         * HashMap - массив линкедлистов, который содержит ключи и элементы.
         * */

        map.put("Id1", new Student("name1", 1));
        map.put("Id2", new Student("name2", 2));
        map.put("Id3", new Student("name3", 3));
        map.put("Id4", new Student("name4", 4));

        Student id3 = map.get("Id3");
        Student id5 = map.get("Id5");

        System.out.println(id3);
        System.out.println(id5);

        String key = "id5";

        if (map.containsKey(key)) {
            map.get(key);
        }

        Student remove = map.remove(key);
        //Как итерироваться?
        //Цикл будет возвращать пару "ключ - значение"
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            Student value = entry.getValue();

        }
        /**
         * Если метод HashCode не переопределить, то он будет в качестве int значения объекта выдавать их адрес (ссылку), а не цифровую реализацию.
         * Если переопределить, то метод будет работать нормально и при одинаковом содержании объектов выдавать одинаковое значение HashCode.
         * */

        Set<String> settt = new HashSet<>();
        settt.add("S1");
        settt.add("S2");
        settt.add("S1");
        settt.add("S2");
        settt.add("S3");

        System.out.println(settt);

        /**
         * Stream
         * */

        Fruit fruit = new Fruit("apple", 2, "Antonovka");
        Fruit fruit1 = new Fruit("apple", 4, "Grany");
        Fruit fruit2 = new Fruit("pinapple", 1, "African");
        Fruit fruit3 = new Fruit("tomato", 3, "kumyto");
        Fruit fruit4 = new Fruit("tomato", 5, "cherry");

        int i1 = fruit1.hashCode();
        int i2 = fruit2.hashCode();

        List<Fruit> fruits = List.of(fruit1, fruit2, fruit3, fruit4, fruit);
        List<Fruit> tomatos = new ArrayList<>();
        for (Fruit fruitt : fruits) {
            if (fruitt.getName().equals("tomato")) {
                tomatos.add(fruitt);
            }
        }
        double sumAge = 0;
        for (Fruit tomato : tomatos) {
            sumAge += tomato.getAge();
        }

        sumAge /= tomatos.size();

        double avAge = tomatos.stream()
                .filter(fruitt -> fruitt.getName().equals("tomato"))
                .mapToDouble(e -> e.getAge())
                .average().getAsDouble();

        System.out.println(avAge);
    }
}
