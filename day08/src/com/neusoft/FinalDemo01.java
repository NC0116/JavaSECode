package com.neusoft;

public class FinalDemo01 {
    public static void main(String[] args) {
        //声明一个变量，使用final修饰
        final int al;
        al = 10;
        System.out.println(al);
        //al = 20;报错，不可重新赋值



        //报错
//        final int c = 0;
//        for (int i = 0; i < 10; i++) {
//            c = i;
//        System.out.println(c);
//        }
//
        //可以通过编译，可以运行，c是局部 变量，每次循环都是创建了一个新的变量c
        for (int i = 0; i <10 ; i++) {
            final int c = i;
            System.out.println(c);
        }
    }
}
