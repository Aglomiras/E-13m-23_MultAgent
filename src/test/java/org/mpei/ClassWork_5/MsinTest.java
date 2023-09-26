package org.mpei.ClassWork_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MsinTest {
    private List<Students> studentsList = new ArrayList<>();
    @Test
    void listMsinTest1() {
        List<Students> studentsList =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentsList.add(new Students("StName"+i, i));
        }
        Assertions.assertTrue(studentsList.contains(new Students("StName2", 2)));
        Assertions.assertFalse(studentsList.contains(new Students("StName10", 10)));

    }
    @Test
    void listMsinTest2() {
        List<Students> studentsList =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentsList.add(new Students("StName"+i, i));
        }

        Assertions.assertTrue(studentsList.remove(new Students("StName9", 9))); //Если такой элемент есть в коллекции, удаляет его -> операция выполнена, выведет true
        Assertions.assertFalse(studentsList.remove(new Students("StName11", 11))); //Усли такого элемента нет в коллекции, то операции удаления не будет, выведеь false
    }

    @Test
    void exceptionThrowTest1() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> studentsList.get(11));
    }
    @BeforeEach
    void refreshedList() {
        studentsList.clear();
        for (int i = 0; i < 10; i++) {
            studentsList.add(new Students("StName"+i, i));
        }
    }
}