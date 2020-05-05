package com.neusoft;

public class ArrayDemo03{
    public static void main(String[] args) {
        //创建一个数组
        int[] arr= {5, 15, 2000, 10000, 100, 4000};
        //求arr 中的最大值
        //定义一个变量。 储存数组中最大的值， 假设arr中第一个元素是最大的
        int max = arr[0];
        //遍历数组，取出每一个元素，，让每一个元素跟 max 进行比较
        for (int i = 0; i < arr.length; i++) {
          //遍历元素和max进行比较，如果大于max ,就更新max的值
            if (arr[i] >max)
                max = arr[i];//max始终记录最大的值
        }
        System.out.println("数组中最大的值是：" +max);
    }
}
