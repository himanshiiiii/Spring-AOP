package com.demo;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserService {

    public void testMethod1(){

        System.out.println("===Test Method 1===");

    }

    public void testMethod2() throws IOException {

        System.out.println("===Test Method 2===");
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        throw new IOException();


    }
    @Deprecated
    public void testMethod3(){

        System.out.println("===Test Method 3===");

    }

    public void testMethod4(String s){

        System.out.println("===Test Method 4===");

    }


}
