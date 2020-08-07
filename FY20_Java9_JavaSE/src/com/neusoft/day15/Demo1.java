package com.neusoft.day15;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
        if (1==1){
           // throw new NullPointerException("要访问的数组不存在");
            throw new ArrayIndexOutOfBoundsException("数组越界了");

        }
    }
}
