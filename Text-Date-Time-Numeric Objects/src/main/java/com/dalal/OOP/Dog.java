package com.dalal.OOP;

public class Dog extends Animal {
    private  int footNumber;
    public Dog(String name, int age, int footNumber) {
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
        System.out.println("Hoof Hoof ....");
    }

    public void dogMethode() {
        System.out.println("dog methode");
    }

}
