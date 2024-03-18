package org.mpei.PracticWork_3.Practic_1;

//Класс, описывающий шар
public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
