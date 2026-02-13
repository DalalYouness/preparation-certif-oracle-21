package com.dalal.multithreading.methode1;

public class TestMethode1 {
    public static void main(String[] args) {
        System.out.println("main thread begin");
        MyThread t1 = new MyThread();
        t1.start();//hna jvm ghada dir system call
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread " + i);
        }
        System.out.println("main thread end");
    }
}
