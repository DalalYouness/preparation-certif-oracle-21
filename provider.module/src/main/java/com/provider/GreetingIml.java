package com.provider;

import com.exemple.GreetingManager;

public class GreetingIml implements GreetingManager {
    @Override
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}
