package com.neusoft;

import java.util.Random;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //求数组中最大的值
        Random random = new Random();
        //创建一个12个元素的随机数组， 值在1~100之间
        int[] arr = new int[12];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(100) ;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
