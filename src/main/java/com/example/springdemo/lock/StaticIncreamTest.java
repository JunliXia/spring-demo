package com.example.springdemo.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class StaticIncreamTest {

    public static volatile Integer num = 0;

    public static void add(){
            num++;
    }


     void run() throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        add();
                    }

                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(num);
    }


    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 100; i++) {
            StaticIncreamTest staticIncreamTest = new StaticIncreamTest();
            staticIncreamTest.run();

//        }

    }



}
