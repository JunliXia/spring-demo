package com.example.springdemo.common;

/**
 * @author: admin
 * @date: 2020/1/3 14:53
 * @description:
 */
public class ContinueTest {
    public static void main(String[] args) {
        testForMulti();
    }



    public static void testForMulti(){
        outer:
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("i=" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 4){
                    continue outer;
                }
                System.out.println("j=" +j);
                for (int k = 0; k < 10; k++) {
                    if (k == 5){
                        continue outer;
                    }
                    System.out.println("k="+k);
                }
            }
        }

    }
}
