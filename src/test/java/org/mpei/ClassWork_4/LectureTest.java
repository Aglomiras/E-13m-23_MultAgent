package org.mpei.ClassWork_4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

//@Slf4j
class LectureTest {
    private int a;
    private int b;
    @BeforeAll //Аннотация означающая, что данный метод запускается до начала всех тестов
    public static void initialMethod() {
//        log.info("Start testin");
    }
    @BeforeEach
    public void everyTime() {
//        log.info("Start new test method");
        a+=1;
        b+=1;
    }
    @org.junit.jupiter.api.Test
    @DisplayName("testCalculet")
    @RepeatedTest(5)
    void testCalculet() {

        int a = 5;
        int b = 7;

        Lecture lecture = new Lecture();
        int sum = lecture.calculet(a, b);

        Assertions.assertEquals(12, sum);
    }
    @Test
    @DisplayName("testCalculet2")
    void testCalculet2() {
        int a = 6;
        int b = 8;

        Lecture lecture = new Lecture();
        int sum = lecture.calculet(a, b);

        Assertions.assertEquals(14, sum);
    }
}