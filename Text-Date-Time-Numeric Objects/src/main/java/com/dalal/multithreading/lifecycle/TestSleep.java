package com.dalal.multithreading.lifecycle;

import com.dalal.multithreading.methode1.MyThread;

public class TestSleep {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();




    }
}
