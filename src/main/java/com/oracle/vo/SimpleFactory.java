package com.oracle.vo;

public class SimpleFactory {
    public static Weapon getWeapon(){
        return new Weapon("诸葛连弩",44);
    }

}
