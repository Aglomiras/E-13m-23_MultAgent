package org.mpei.PracticWork_3.Practic_1;

//Класс фигуры, у которой есть радиус
public class SolidOfRevolution extends Shape {
    private double radius;

    //Конструктор
    public SolidOfRevolution(double volume, double radius) {
        super(volume); //Объем
        this.radius = radius; //Радиус
    }

    public double getRadius() {
        return radius;
    }
}
