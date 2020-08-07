package com.neusoft.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextDate3 {
    public static void main(String[] args) throws ParseException {
        String str = "2001年6月6日";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date  = df.parse(str);
        System.out.println(date);
    }
}
