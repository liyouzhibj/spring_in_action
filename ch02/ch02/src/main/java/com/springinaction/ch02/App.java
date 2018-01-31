package com.springinaction.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        String s[] = System.getProperty("java.class.path").split(";");
//        for (String string : s) {
//            System.out.println(string);
//        }

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer duke = (Performer)applicationContext.getBean("duke");
        duke.perform();

        Performer poeticDuke = (Performer)applicationContext.getBean("poeticDuke");
        poeticDuke.perform();

        Performer kenny = (Performer)applicationContext.getBean("kenny");
        kenny.perform();

//        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("E:/spring-idol.xml");
//        Performer performer1 = (Performer)applicationContext1.getBean("duke");
//        performer1.perform();
    }
}
