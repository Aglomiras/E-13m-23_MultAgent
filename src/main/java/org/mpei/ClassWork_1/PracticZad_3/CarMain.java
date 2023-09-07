package org.mpei.ClassWork_1.PracticZad_3;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        String info_1 = car1.shortInfo();
        System.out.println("\033[0;32m" + "Начальные значения: " + info_1);

        car1.setModel("Lada");
        car1.setAge(13);
        car1.setWide(46.9);

        String info_2 = car1.shortInfo();
        System.out.println("\033[0;34m" + info_2);

        Car car2 = new Car("Jigul", 12, 35.98);
        System.out.println("\033[0;34m" + car2.shortInfo());

        WeelType wt = new WeelType("Nokia", 18, true);
        car2.setWeelType(wt);
        System.out.println("\033[0;34m" + car2);
    }
}
