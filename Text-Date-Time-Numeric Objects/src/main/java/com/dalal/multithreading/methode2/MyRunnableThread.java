package com.dalal.multithreading.methode2;

//hna l objet dyali li sayab l comportement dyalo anaho kaydir run
public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("my thread " + i);
        }
    }
}
