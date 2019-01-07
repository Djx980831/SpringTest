package com.oracle.vo;

public class Weapon {

    String name;
    int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    public Weapon(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
