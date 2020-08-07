package com.neusoft.day13;

import java.util.Calendar;

public class CalendarText3 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year= calendar.get(Calendar.YEAR);

        int month = calendar.get(Calendar.MONTH)+1;

        calendar.add(Calendar.DAY_OF_MONTH,2);
       int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");

        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
