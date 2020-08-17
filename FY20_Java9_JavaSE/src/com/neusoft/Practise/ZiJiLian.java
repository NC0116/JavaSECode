package com.neusoft.Practise;

import java.util.Scanner;

public class ZiJiLian {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请录入第一个整数: ");
//        int a = sc.nextInt();
//        System.out.println("请录入第二个整数: ");
//        int b = sc.nextInt();
//        System.out.println("请录入第三个整数: ");
//        int c = sc.nextInt();
//      int max =Math.max(a,b);
//      max = Math.max(max,c);
//      int min=Math.min(a,b);
//      min=Math.min(min,c);
//      int midden=(a+b+c)-(max+min);
//        System.out.println(max+""+midden+""+min);
//        int max=a;
//        int midden=b;
//        int min=c;
//        if (a>b && a>c && b>c){
//            max=a;
//            midden=b;
//            min=c;
//        }else if(b>a && b>c && ){
//            max=b;
//            midden=c;
//            min=a;
//
//        }else if (c>b && b<a){
//            max=c;
//            midden=a;
//            min=b;
//        }
//        System.out.println(max+" "+midden+" "+min);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请录入小明的考试成绩: ");
//        int score = sc.nextInt();
//        if (score >= 0 && score <= 100) {
////            (score- score%10)/10;
//            //合法成绩
//            switch (score / 10) {
//                case 10:
//                case 9:
//                    System.out.println("奖励小明: 山地自行车一辆");
//                    break;
//                case 8:
//                    System.out.println("奖励小明: 游乐场玩儿一次");
//                    break;
//                case 7:
//                    System.out.println("奖励小明: 变形金刚玩具一个");
//                    break;
//                default:
//                    System.out.println("奖励小明: 男女双混组合拳 + 扫帚棒法");
//                    break;
//            }
//        } else {
//            //非法成绩
//            System.out.println("您录入的成绩有误!");
//        }
        int flag = 6;
        int count = 0;

        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + "\t");
            if (++count % flag == 0)
                System.out.println();
        }

    }
}
