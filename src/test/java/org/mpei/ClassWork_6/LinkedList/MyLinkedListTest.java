package org.mpei.ClassWork_6.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void removeTest() {
        List<String> list = new MyLinkedList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");

        Assertions.assertEquals(3, list.size());
    }
    @Test
    void testAdd() {
        List<String> list = new MyLinkedList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");

        Assertions.assertEquals("str3", list.get(2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {list.get(4);});
    }
}