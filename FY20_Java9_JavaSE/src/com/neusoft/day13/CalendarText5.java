package com.neusoft.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarText5 {
    public static void main(String[] args) throws ParseException {
       // getActualMaximum.获取给定日历的最大可能值
        String lastDayOfMonth = getLastDayOfMonth("2020-06");

        System.out.println( lastDayOfMonth);
        int lastDay  = lastDay(2020,07);


//设置年


    }




  //  编写一个方法，根据给定字符串yyyy-MM获取当月的最后一天
    public static String getLastDayOfMonth(String yearmonth) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM");
        Date date  = sdf.parse(yearmonth);
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        int lastDay  = calender.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ""+lastDay;
    }
    public static int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();

        calendar.clear(); // 清除所有日期数据
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;

    }
}
