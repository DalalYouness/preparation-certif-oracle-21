package com.dalal.multithreading.lifecycle;

import com.dalal.multithreading.methode1.MyThread;

public class ThreadLifecycleTest {
    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        System.out.println("T1 state: " + t1.getState()); // NEW
//        t1.start();
//        t2.start();
//
//        while (t1.isAlive() || t2.isAlive()) {
//            System.out.println("T1 state: " + t1.getState());
//            System.out.println("T2 state: " + t2.getState());
//            Thread.sleep(200); // check states every 200ms
//        }
//
//        System.out.println("T1 state: " + t1.getState()); // TERMINATED
//        System.out.println("T2 state: " + t2.getState()); // TERMINATED

        System.out.println("PID :" + ProcessHandle.current().pid()); //get Process id
        System.out.println("Thread : " + Thread.currentThread().getName()); // ay3tina main
        System.out.println("Thread id : " +  Thread.currentThread().getId()); //id 1
        //pour void quelle processor traite ce thread
        //java makatqdrch twsl l had lma3loma hit machi fhal c# machi depend lwhd system d'exploitation
    }
}
