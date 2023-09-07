package org.mpei.ClassWork_1.PracticZad_3;

public class Car {
    private String model;
    private int age;
    private double wide;
    public String name;
    private WeelType weelType;

    public String shortInfo() {
        return model +"; age: " + age + "; radius: " + wide;
    }

    /**
     * Конструктор это метод класса, который принимает или не принимает какие-либо параметры.
     * */
    public Car() {}
    public Car(String model, int age, double wide) {
        this.model = model;
        this.age = age;
        this.wide = wide;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWide() {
        return wide;
    }
    public void setWide(double wide) {
        this.wide = wide;
    }

    public WeelType getWeelType() {
        return weelType;
    }

    public void setWeelType(WeelType weelType) {
        this.weelType = weelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", wide=" + wide +
                ", weelType=" + weelType +
                '}';
    }
}
