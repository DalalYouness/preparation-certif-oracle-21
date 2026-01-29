package com.dalal.reflexion;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> personClass = Person.class; //.class z3ma l object dyal had l class class
        Field firstNameField = personClass.getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        Field lastNameField = personClass.getDeclaredField("lastName");
        lastNameField.setAccessible(true);

        firstNameField.set(person,"youness");
        lastNameField.set(person,"dalal");

        System.out.println((String)firstNameField.get(person));
        System.out.println((String)lastNameField.get(person));
    }
}
