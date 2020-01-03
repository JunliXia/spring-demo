package com.example.springdemo.common;

/**
 * @author: admin
 * @date: 2020/1/3 15:03
 * @description:
 */
public class SwitchTest {

    public static void main(String[] args) {

//        testSwitchString();
        testSwitchEnum();
    }


    public static void testSwitchEnum(){

        Color color = Color.red;
        switch (color){
            case red:
                System.out.println("red");
                break;
            case green:
                System.out.println("grenn");
                break;
            default:
                System.out.println("null");
        }

    }

    enum Color{
        red,green;

        Color() {
        }


    }


    public static void testSwitchString(){

        String string1= "1";

        switch (string1){
            case "1":
                System.out.println("1"+ string1);
                break;
            case "2":
                System.out.println("2" + string1);
                break;
            case "3":
                System.out.println("3" + string1);
                break;
            default:
                System.out.println("null");
        }


    }
}
