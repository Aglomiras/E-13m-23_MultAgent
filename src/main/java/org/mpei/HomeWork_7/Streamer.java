package org.mpei.HomeWork_7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Streamer {
    private String name;
    private double averageMark;
    private int age;
    private int subscribers;
    public List<Platform> platforms;

}
