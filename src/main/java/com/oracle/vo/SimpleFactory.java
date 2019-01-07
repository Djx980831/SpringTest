package com.oracle.vo;

public class SimpleFactory {
    public static Weapon getWeapon(int a){
        if(a == 0){
            return new Weapon("诸葛连弩",44);
        }else {
            return new Weapon("穿云箭",55);
        }

    }

}
