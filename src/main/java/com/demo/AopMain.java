package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

    public static void main(String[] args)throws Exception {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AopConfig.class);
        UserService userService= (UserService) applicationContext.getBean("userService");
//        userService.testMethod1();
        //userService.testMethod2();
        userService.testMethod3();
        userService.testMethod4("abc");


    }
}
