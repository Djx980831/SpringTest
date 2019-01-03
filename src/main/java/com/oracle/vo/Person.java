package com.oracle.vo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Component
public class Person {

    String name;
    int age;

    String [] habby;
    List<String> skill;
    Set<Weapon> ws;
    Map<String,Integer> score;

    public void setHabby(String[] habby) {
        this.habby = habby;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    public void setWs(Set<Weapon> ws) {
        this.ws = ws;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    Weapon weapon;
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void attack(){
        System.out.println(this.name+" 正在使用武器 "+weapon.getName()+" 进行攻击，攻击力是："+weapon.getPower());
        if(habby != null){
            System.out.println("爱好："+Arrays.toString(habby));
        }
        if(skill != null){
            System.out.println("技能有："+skill);
        }
        if(ws != null){
            System.out.println("武器有：");
            System.out.println("---------------");
            for(Weapon w : ws){
                System.out.println(w.getName());
            }
            System.out.println("---------------");
        }
        if(score != null){
            System.out.println(score);
        }


    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("两个参数的构造方法。");
    }

    public Person(){}


    public Person(int age,String name) {
        this.name = name;
        this.age = age;
    }

}


