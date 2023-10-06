package org.mpei.ClassWork_6.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.function.Consumer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;

    public void doActive(Consumer<String> consumer) {
        consumer.accept(name);
    }
}
