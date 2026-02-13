package com.dalal.multithreading;

public class MutiThreadTest {


    public static void main(String[] args) {

        System.out.println("im the begining of main thread");
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread " + i);
        };
       Thread t1 = new Thread(() ->{
           for (int i = 0; i < 10; i++) {
               System.out.println("Im thread 1");
               System.out.println("i = " + i);
           }
       });
       t1.start();
       Thread t2 = new Thread(()->{
           for (int i = 0; i < 10; i++) {
               System.out.println("Im thread 2");
               System.out.println("i = " + i);
           }
       });
       t2.start();

        System.out.println("im the end of ");

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
