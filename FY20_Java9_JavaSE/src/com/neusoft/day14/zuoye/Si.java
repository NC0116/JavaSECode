package com.neusoft.day14.zuoye;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Si{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //2.使用put添加元素
        map.put("嬴政","秦朝");
        map.put("刘邦","汉朝");
        map.put("朱元璋","明朝");
        map.put("李世民","唐朝");

      //  Collection<String> values = hm.values();
        for ( String val:map.values()){
            System.out.println(val);
        }
        System.out.println("=============");


        Iterator<String> itr = map.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }






    }
}
