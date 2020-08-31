package com.neusoft.Practise.wushidaoti;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
//        【程序14】
//        题目：输入某年某月某日，判断这一天是这一年的第几天？
//        程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
//
//        Scanner scanner = new Scanner(System.in).useDelimiter("\\D");
//        System.out.println("请输入时间，xx年-xx月--xx日：");
//        int year= scanner.nextInt();
//        int month= scanner.nextInt();
//        int day= scanner.nextInt();
//                int n=0;
//                int sum=0;
//        int[] month_date ={0,31,28,31,30,31,30,31,31,30,31,30};
//            if (year % 400==0 && year%4==0 && year%100 !=0){
//                month_date[2]=29;}
//        for (int i = 0; i <month; i++) {
//                n += month_date[i];
//                sum =day+n;
//            System.out.println("今天是今年的第"+sum+"天");
//        }
//
//    }


//        Scanner scan = new Scanner(System.in).useDelimiter("\\D");//匹配非数字
//        System.out.print("请输入当前日期（年-月-日）:");
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int date = scan.nextInt();
//        scan.close();
//        System.out.println("今天是"+year+"年的第"+analysis(year,month,date)+"天");
//    }
//    //判断天数
//    private static int analysis(int year, int month, int date){
//        int n = 0;
//        int[] month_date = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
//        if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
//            month_date[2] = 29;
//        for(int i=0;i<month;i++)
//            n += month_date[i];
//        return n+date;
//    }
        int[] arr={2,3,7,8};
        int[] arr1={0,3,2,1,3};
        String tel="";
        for (int x:arr1) {
            tel +=arr[x];
        }
        System.out.print(tel);
    }
}
