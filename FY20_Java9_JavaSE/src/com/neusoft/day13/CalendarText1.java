package com.neusoft.day13;

import java.sql.Date;
import java.util.Calendar;

public class CalendarText1 {
    public static void main(String[] args) {



        //创建calender对象
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

//设置年

        int year= calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");

    }
}
