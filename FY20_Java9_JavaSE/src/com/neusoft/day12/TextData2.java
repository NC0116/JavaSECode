package com.neusoft.day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextData2 {
    public static void main(String[] args) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date  = new Date();
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        String str1 = simpleDateFormat.format(date);
        System.out.println(str);
        System.out.println(str1);
    }
}
