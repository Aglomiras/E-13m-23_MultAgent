package org.mpei.ClassWork_2.Nasledovanie;

public class NPC {
    protected boolean isAlive;
    protected double speed;
    protected String name;

    public NPC(boolean isAlive, double speed, String name) {
        this.isAlive = isAlive;
        this.speed = speed;
        this.name = name;
        this.born();
    }

    public NPC() {
    }

    private void born() {
        System.out.println("I was born");
    }

    public void attack() {
        System.out.println("Attack!!!");
    }
    public void say() {
        System.out.println(this.name + " " + this.isAlive);
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
