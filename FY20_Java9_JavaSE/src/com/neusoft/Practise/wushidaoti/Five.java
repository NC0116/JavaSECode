package com.neusoft.Practise.wushidaoti;

import java.util.Scanner;

public class Five {

//try {
//    Scanner scanner = new Scanner(System.in);
//    while(true){
//        System.out.println("请输入成绩：");
//        Double mark= scanner.nextDouble();
//        if (mark<=0 || mark>100){
//            System.out.println("无成绩！");
//        }else if (mark>=90 ){
//            System.out.println("成绩为A");
//        }else if (mark>=60){
//            System.out.println("成绩为B");
//        }else if (mark<60){
//            System.out.println("成绩为c");
//
//        }else {
//            break;
//        }
//    }
//}catch (ArrayIndexOutOfBoundsException e){
//    System.out.println("请输入成绩");
//}
//
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        Double n= scanner.nextDouble();
        String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
        System.out.println(str);
    }
}
