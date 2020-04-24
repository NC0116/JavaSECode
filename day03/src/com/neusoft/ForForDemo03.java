package com.neusoft;

import javax.imageio.stream.ImageOutputStream;

public class ForForDemo03 {

    //for 循环有时会使用嵌套
    //不使用嵌套执行打印2020-1~2023-12 之间的所有月份
    //格式：xxx年 xx月
//    public static void main(String[] args) {
    //复杂写法：
//        //2020
//        for (int i = 1; i <=12; i++) {
//            System.out.println("2020年"+i+"月\t");
//        }
//        //2021
//        for (int i = 1; i <=12; i++) {
//            System.out.println("2021年"+i+"月\t");
//        }
//        //2022
//        for (int i = 1; i <=12; i++) {
//            System.out.println("2022年"+i+"月\t");
//        }
//        //2023
//        for (int i = 1; i <=12; i++) {
//            System.out.println("2023年"+i+"月\t");
//        }
//    }



    //简单写法：
    public static void main(String[] args) {
        //控制年份
        for (int i = 2020; i <=2023 ; i++) {
            //控制月份
            for (int j = 1; j <=12 ; j++) {
                System.out.print(i +"年"+j+"月\t\n");
            }
            System.out.println();
        }
    }
}
