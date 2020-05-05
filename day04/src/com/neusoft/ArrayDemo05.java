package com.neusoft;

import javax.naming.NamingEnumeration;

/**
 * 数组作为方法的参数进行传递
 *
 */

public class ArrayDemo05{

  public static void main(String[] args) {
     // sayHello("小花");
      int[] arr= {1,3,5,7,9,};
      printArray(arr);
    }


//
//    public static void sayHello(String name) {
//        System.out.println("Hello" + name);
//    }
    //之前我们看到的方法都是基本数据类作为参数的
    // 使用数组作为方法的参数
//    public static void printArray(形参 实参) {
//    }

   // public static void printArray(数据类型 变量值) {
//    }

    public static void printArray(int[] arr) {
        //想要打印出数组， 我们可以使用for 循环遍历它
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
