package com.practice.mt.problems;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintSequenceMulThreads {
    public static void main(String[] args) throws InterruptedException {
        PrintingClass p1= new PrintingClass(1);
        PrintingClass p2= new PrintingClass(2);
        PrintingClass p3= new PrintingClass(0);

        Thread t1= new Thread(p1,"T0");
        Thread t2= new Thread(p2,"T1");
        Thread t3= new Thread(p3,"T2");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}

class PrintingClass implements Runnable{
    static final Lock lock = new ReentrantLock();
    static int counter = 0;
    int limit = 30;
    int remainder;

    PrintingClass(int remainder){
        this.remainder = remainder;
    }
    @Override
    public void run() {
        while (limit >= counter) {
            synchronized (lock) {
                while (counter % 3 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" " + counter++);
                lock.notify();
            }
    }
    }
}
