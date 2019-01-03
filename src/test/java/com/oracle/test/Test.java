package com.oracle.test;

import com.oracle.vo.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p = (Person)factory.getBean("p");

        Person p8 = (Person)factory.getBean("p8");

        p8.attack();

    }


}
