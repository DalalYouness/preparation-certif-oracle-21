package com.dalal.multithreading.methode2;

public class TestRunnable {
    public static void main(String[] args) {
        System.out.println("main thread start");
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread1 = new Thread(myRunnableThread);

        Thread thread2 = new Thread(myRunnableThread);
        thread1.start();
        thread2.start();
        System.out.println("main thread end");
    }
}
