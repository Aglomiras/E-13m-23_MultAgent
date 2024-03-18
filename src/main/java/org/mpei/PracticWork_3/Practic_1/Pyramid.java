package org.mpei.PracticWork_3.Practic_1;

//Класс, описывающий пирамиду
public class Pyramid extends Shape {
    private double height; //Высота пирамиды
    private double s; //Площадь основания

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}
