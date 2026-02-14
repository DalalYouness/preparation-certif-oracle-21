package com.dalal.multithreading.racecondition;




class Counter {
    private int value;
    public Counter(int value) {
        this.value = value;
    }
    public void increment(int value) {
        this.value += value;
    }
    //hna drna sychronzie anaho thread li dkhal kay locker l methode anaho ta thread maydkhol liha
    // mais la bonne facon hiya nhbas l partie li fl code li ghayqdr ytra fiha un probleme
    //donc ghan7ayad synchronized man la methode
    public  void decrement(int value) throws InterruptedException {

        /*
        * par exemple :
        * t1 entre avec 40 => 50 > 40 = true => entrer
        * sleep(1000) n3as (7bas)
        * t2 entre avec 20 => 50 > 20 = true => entrer
        * sleep(1000) n3as (7bas)
        * scheduler ghadi yrj3 y3ti l t1 ykhdm
        * 50 - 40 = 10;
        * this.value = 10 walat fiha 10 o mea dalik t2 dakhl 20 dkhaaal
        * 10 - 20 = -10 hada howa le probleme
        * */
        synchronized(this) {
            if ( this.value > value ) {
//                Thread.sleep(1000);
                this.value -= value;
            }
        }

    }
    //bach thread dyal main mayqrach l value o howa baqi masalach lhsab f les thread lakhrin
    public synchronized int getValue() {
        return value;
    }
}
public class Problématique {
    public static void main(String[] args) throws InterruptedException {
        //ssynchrounous programming pas de probleme
        Counter counter = new Counter(50);
        counter.decrement(40);
        counter.decrement(20);
        System.out.println("Counter : " + counter.getValue());
    }
}

class Solution {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(50);

        Thread t1 = new Thread(() -> {
            try {
                counter.decrement(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                counter.decrement(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("result = " + counter.getValue());
    }
}
