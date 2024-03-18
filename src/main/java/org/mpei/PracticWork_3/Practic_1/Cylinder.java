package org.mpei.PracticWork_3.Practic_1;

//Класс, описывающий цилиндр
public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
