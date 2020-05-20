package com.neusoft;

import java.util.Arrays;
//1.toString() 返回此对象本身（他已经是一个字符串！）返回对象的字符串表示形式
//2.static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
//3.copyOf(boolean[] original,int newlength) 复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。
// (返回一个新的数组。不影响原来的数组)
public class ArraysDemo01 {
    public static void main(String[] args) {
        //1.toString() 返回此对象本身（它已经是一个字符串！）
        //返回对象的字符串表达式

        int[] arr = {3, 17, 4, 1, 19, 5};
        System.out.println(arr);  //输出的为地址
        System.out.println("-------------------");
        System.out.println(Arrays.toString(arr));  //{3, 7, 4, 1, 18, 5}
        System.out.println("-------------------");
        //static void sort(int[] a) 对指定 int 型数组的指定范围按数字升序进行排序。
        System.out.println("排序前" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
        System.out.println("-------------------");
        //2.进行字符升序排序,并且倒序打印
        String line = "DSAmsadsaopMIPLOK";
        char[] array = line.toCharArray();
        Arrays.sort(array);
        System.out.println("升序排序后"+Arrays.toString(array));
        //反向遍历输出
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] +"\t");
        }
        System.out.println("");
        System.out.println("------------------------");

        //3.copyOf(boolean[] original,int newlength)
        //复制指定的数组，截取或用false填充（如有必要），以使副本具有指定的长度。
        //返回一个新的数组。不影响原来的数组
        int[] ints = Arrays.copyOf(arr, arr.length);//完全复制
        System.out.println(Arrays.toString(ints));
        int[] ints1 = Arrays.copyOf(arr,4 );//复制前四个
        System.out.println(Arrays.toString(ints1));

    }
}
