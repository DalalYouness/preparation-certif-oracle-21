package com.consumer;

import com.exemple.GreetingManager;

import java.util.ServiceLoader;


public class Main {
    public static void main(String[] args) {

        Object obj = new Point();


        String result = switch (obj) {
            case Point(int x , int y) when x > 0 && y > 0 -> {
                yield "Positive Point : (x = " + x + ", y = " + y + ")";
            }
            case Point(int x , int y) -> "Negative Point : (x = " + x + ", y = " + y + ")";
            default -> "Unknown Point";
        };

        System.out.println(result);



    }
}
