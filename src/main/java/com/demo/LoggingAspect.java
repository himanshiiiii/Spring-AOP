package com.demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.demo.UserService.*(..))")
    public void logAfter(){
    System.out.println("===Log After===");
    }

//    @Before("execution(* com.demo.UserService.*(..))")
//    @Before("within(com.demo.UserService)")
//    @Before("execution(* com.demo.UserService.*(String))")
//    @Before("this(com.demo.UserService)")
//    public void logBefore(){
//        System.out.println("===Log Before===");
//    }

    @AfterThrowing(value = "execution(* com.demo.UserService.*(..))",throwing = "e")
    public void logAfterThrowing(Exception e) throws Throwable{
        if(e instanceof IOException)
        System.out.println("===Throwing IO Exception===");
    }
    @Before("execution(* com.demo.UserService.*(..)) && @annotation(java.lang.Deprecated)")
    public void logBefore1(){
        System.out.println("===Deprecated Method===");
    }
}
