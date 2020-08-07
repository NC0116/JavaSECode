package com.neusoft.day13;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Calendar;

public class CalendarText2 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year= calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
        calendar.set(Calendar.YEAR, 2021);
        int year1= calendar.get(Calendar.YEAR);
        System.out.println(year1+"年"+month+"月"+day+"日"); // 2020年7月28日


    }
}
