package com.neusoft;


/**
 * 对数组进行反转
 * {1,2,3,4,5}
 * {5,4,3，2,1}
 * 只要实现就行
 * 不创建新的范围
 */

public class ArrayDemo04{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int min = 0, max = arr.length-1 ; min <= max ;min++,max--) {
          int temp = arr[min];
          arr [min] = arr[max];
          arr[max] = temp;
        }
        //重新遍历反转的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
