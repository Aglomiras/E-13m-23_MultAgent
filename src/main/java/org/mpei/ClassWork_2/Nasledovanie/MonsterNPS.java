package org.mpei.ClassWork_2.Nasledovanie;

public class MonsterNPS extends NPC {
    private boolean angry;

    public MonsterNPS() {

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
