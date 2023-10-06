package org.mpei.ClassWork_8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private String surname;
    private String departament;
    private int experienc;
    private Sex sex;
}
