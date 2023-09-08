package org.mpei.ClassWork_2.Polimorfizm;

public interface Walkabel {
    static double speed = 100;
    double walk();

    default int getVersion() {
        return 42;
    }
}
