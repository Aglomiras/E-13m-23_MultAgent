package org.mpei.ClassWork_18;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Double sum;
    private List<String> items;
}
