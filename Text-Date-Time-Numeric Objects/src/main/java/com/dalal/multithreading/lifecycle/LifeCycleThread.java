package com.dalal.multithreading.lifecycle;

public class LifeCycleThread extends Thread {
    @Override
    public void run() {
        //parce que lorsqu'on fait appel à start elle appelle autom run
        // donc dans ce cas le thread à entrer dans l'etat runnable il attend le scheduler de os ( scheduler queue)
        //lorsque le scheduler donne un time slicing au thread on appelle ca running state
        System.out.println(this.getName() + " : RUNNING");

        try {
            Thread.sleep(1000); // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (LifeCycleThread.class) { // BLOCKED لو Thread أخرى مشغولة
            System.out.println(getName() + " : INSIDE SYNCHRONIZED BLOCK");
        }

        System.out.println(getName() + " : FINISHED");
    }
}
