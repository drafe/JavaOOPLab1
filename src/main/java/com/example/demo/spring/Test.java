package com.example.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        Employee em = context.getBean("lonelyMen", Employee.class);

        em.goToWork();
        em.wentFromWork();
        em.restAtHome();

        System.out.println(String.format("This is a routine of %s, that is %d years old..", em.getName(), em.getAge()));

        context.close();
    }
}
