package com.neusoft.day13;

public class BaoZhuang {
    public static void main(String[] args) {
//        Integer i = new Integer(6);//基本变包装
//        int i2  = i.intValue();//包装变基本
//
//        Integer i1 = 5;//自动装箱
//        i1 =  i1 + 5 ;//自动拆箱
//        int a = 100;
//        System.out.println("a的值"+a);
//


        //"123"  123
        //基本类型转化为字符串类型（String）
        int b = 100;
       String c  = ""+b;
        System.out.println(c);

        //String转化为基本类型
        //包装都有parseXxx静态方法可以将字符串转化为对应的基本类型
        int i3 = Integer.parseInt("120");
        Integer i = Integer.valueOf("12");
        System.out.println(i);
        System.out.println(i3);

    }
}
