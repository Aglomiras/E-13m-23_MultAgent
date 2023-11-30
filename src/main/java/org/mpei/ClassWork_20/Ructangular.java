package org.mpei.ClassWork_20;

public class Ructangular {
    private double sideA;
    private double sideB;

    public Ructangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area() {
        return sideA * sideB;
    }
}
