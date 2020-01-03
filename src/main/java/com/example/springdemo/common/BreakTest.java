package com.example.springdemo.common;

/**
 * @author: admin
 * @date: 2020/1/3 14:48
 * @description:
 */
public class BreakTest {


    public static void main(String[] args) {
        testForMulti();
        add();
    }

    public static void add() {
        int num = 0;
        outer:
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j>i){
                    break;
                }
                if(i==6){
                    break outer;
                }
                num = num + 1;
            }

        }
        System.out.println(num);
    }



    public static void testForMulti(){

        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            if (i == 3){
                break;
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" +j);
                if (j == 4){
                    break;
                }
                for (int k = 0; k < 10; k++) {
                    System.out.println("k="+k);
                    if (k == 5){
                        break;
                    }

                }
            }
        }


    }


}
