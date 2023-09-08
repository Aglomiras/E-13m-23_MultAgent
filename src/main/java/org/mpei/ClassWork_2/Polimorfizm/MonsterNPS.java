package org.mpei.ClassWork_2.Polimorfizm;

import org.mpei.ClassWork_2.Nasledovanie.NPC;

public class MonsterNPS extends NPC implements Walkabel {
    private boolean angry;

    @Override
    public int getVersion() {
        return Walkabel.super.getVersion();
    }

    @Override
    public double walk() {
        return 40;
    }

    @Override
    public void attack() {
        System.out.println("Monster attack!!!");
    }
    public void say() {
        System.out.println(this.name + " " + this.isAlive);
    }

    public boolean isAgrea() {
        return angry;
    }

    public void setAgrea(boolean angry) {
        this.angry = angry;
    }
}
