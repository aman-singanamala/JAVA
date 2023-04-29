package com.company.Random_Practice.exams;
import java.util.*;
class Thread1 extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 11; i <= 110; i += 11) {
            System.out.println("Thread3: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Q8 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2= new Thread2();
        Thread3 t3= new Thread3();

        t1.start();
        t2.start();
        t3.start();


    }
}