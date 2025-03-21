package org.studi.spring.controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.studi.spring.entity.StatsConverter;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[] {"StatsConverter.xml"}
        );
        StatsConverter statsConverter =(StatsConverter)appContext.getBean("id1");
        statsConverter.exec();
        System.out.println(statsConverter);
        appContext.close();
    }
}