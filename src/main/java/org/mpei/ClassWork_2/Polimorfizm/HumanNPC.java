package org.mpei.ClassWork_2.Polimorfizm;

public class HumanNPC implements Walkabel {
    @Override
    public double walk() {
        return 20;
    }

    @Override
    public int getVersion() {
        return Walkabel.super.getVersion();
    }
}
