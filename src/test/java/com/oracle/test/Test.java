package com.oracle.test;

import com.oracle.vo.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person user = (Person)factory.getBean("person");
        System.out.println(user.toString());
        user.setName("李云龙");

        System.out.println(user.toString());

        Person user1 = (Person)factory.getBean("person");

        System.out.println(user1.toString());
    }


}
