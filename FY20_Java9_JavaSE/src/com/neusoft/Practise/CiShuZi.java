package com.neusoft.Practise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class CiShuZi {
    public static void main(String[] args) throws ParseException {

//        Random ran = new Random();
//        int r = ran.nextInt(100)+1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个1-100的数字：");
//        while (true){
//            int i= sc.nextInt();
//            if (i>r){
//                System.out.println("大了");
//            }else if (i<r){
//                System.out.println("小了");
//            }else{
//                System.out.println("恭喜你猜中了，送跑车一个");
//                 break;
//            }
//
//        }


        //  用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
//        Date date = new Date();
//        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String D =sim.format(date);
//        System.out.println(D);


        // 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = df.parse("2018-03-04");
//        System.out.println(date);
//        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
//        String str= df2.format(date);
//        System.out.println(str);


         //用程序判断2018年2月14日是星期几。
      //  获取当前日历
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,14);
        int year=c.get(Calendar.YEAR);
        int month =c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year+"年"+month+"月"+day+"日"+"是星期"+week);
    }
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
//        //创建Calendar对象
//        Calendar c = Calendar.getInstance();
//        //将给定的日历字段设置到Calendar对象中
//        c.set(Calendar.YEAR, 2018);
//        c.set(Calendar.MONTH, 1);
//        c.set(Calendar.DATE, 14);
//        //设置年
//        int year = c.get(Calendar.YEAR);
//        //设置月
//        int month = c.get(Calendar.MONTH)+1;
//        //设置日
//        int date = c.get(Calendar.DATE);
//        //设置星期
//        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
//        //输出结果
//        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
//    }
//    //定义方法，获取星期汉字
//    public static char getWeek(int a){
//        char[] c = {' ','日','一','二','三','四','五','六'};
//        return c[a];
//    }


}
