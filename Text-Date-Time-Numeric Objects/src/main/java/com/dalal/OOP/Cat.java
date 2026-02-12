package com.dalal.OOP;

public class Cat extends Animal {
    private  int footNumber;

    public Cat(String name, int age, int footNumber) {
        super(name, age);
        this.footNumber = footNumber;
    }
    public int getFootNumber() {
        return footNumber;
    }
    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    @Override
    public void makeNoise() {
        System.out.println("Miaw Miaw ....");
    }

    public void catMethode() {
        System.out.println("cat methode");
    }

}
