package com.neusoft.day15;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 4;
        int element = getElement(arr,index);
        System.out.println(element);

    }
    public static int getElement(int[] arr,int index){
        //判断
        if (index < 0 ||index > arr.length){

            throw new ArrayIndexOutOfBoundsException("数组越界了");
        }
    return arr[index];
    }
}
