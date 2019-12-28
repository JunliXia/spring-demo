package com.example.springdemo.lock;

import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;

public class VolatileTest {

    public volatile static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag){

                }
                System.out.println("success");

            }
        }).start();


        Thread.sleep(1000L);
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                VolatileTest volatileTest1 = new VolatileTest();
                volatileTest1.rollBackTest();
            }
        }).start();


    }



    @Transactional
    public void rollBackTest() throws Exception {
        System.out.println("go");
        flag = true;
        System.out.println("done");
        throw new Exception("da");

    }


}
