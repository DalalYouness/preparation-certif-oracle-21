package com.dalal.multithreading;

public class MutiThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("test runnable");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MutiThreadTest());
        t.start();

    }
}


/*
* thread c'est un chemin d'execution howa l masar dyal
* cpu mnin kayqra man ram o kayktab fiha
* o multhread howa kaywliw 3adna bzf dyal lmasarat
*
*
*
* */
