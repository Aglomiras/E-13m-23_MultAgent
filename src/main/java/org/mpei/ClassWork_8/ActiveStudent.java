package org.mpei.ClassWork_8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mpei.ClassWork_6.LinkedList.Student;

import java.util.function.Consumer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveStudent extends Student {
        public ActiveStudent(String name, int age) {
            super(name, age);
        }
        private Consumer<Student> action;

        public void doSomething(){
            action.accept(this);
        }
}
