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
* mnin kangolo un thread kayhjaz lih system d'exploitation stack whd 3an tariq system call
* dyal jvm c'est normale hit kola thread khashom ykhdmo f envi dyalo bodho
* mea les methode o kda o hdchi kaykhali ykono bzf dyal compies mais lheap dkchi li partager
* kaykon fih fhal object donc l aventage dyal heap anaho zone partagé:
* howa state shared hadi hiya aham haja hit 3adna nfs lobjet
* o zid kon kano les objects kol thread coipe dyalo f stack kon rah karita f ram
*
*
* */
