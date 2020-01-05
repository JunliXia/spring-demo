package com.example.springdemo.algorithm;

import sun.misc.Launcher;

import java.util.ServiceLoader;

/**
 * 二分查找
 */
public class EefenChaZhao {

    private static Integer[] strings = new Integer[]{1,5,6,7,12,15,16,18,25,26,28,35};

    private static Integer toSearch(Integer value,Integer low, Integer high){

        Integer middle = (low + high) / 2 + low;

        if (strings[middle].equals(value)){
            return middle;
        }
        if (strings[middle] < value){
            return toSearch(value,low,middle - 1);
        }

        if (strings[middle] > value){
           return toSearch(value,middle + 1,high);
        }




        return 0;
    }

    public static void main(String[] args) {
        EefenChaZhao eefenChaZhao = new EefenChaZhao();
        EefenChaZhao.toSearch(1,0,strings.length-1);
//        for (Integer string : strings) {
//            System.out.println(eefenChaZhao.toSearch(string, strings.length));
//        }

    }

}

