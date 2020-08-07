package com.neusoft.day14.zuoye;

import java.util.HashMap;

public class San {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        //2.使用put添加元素
        map.put("嬴政","秦朝");
        map.put("刘邦","汉朝");
        map.put("朱元璋","明朝");
        map.put("李世民","唐朝");
        System.out.println(map);
//用put修改
        map.put("嬴政","秦国");
        System.out.println(map);

        //remove删除
        System.out.println(map.remove("嬴政")) ;
        //判断
        System.out.println(map.containsKey("嬴政"));
        //获取
        System.out.println(map.get("李世民"));
        System.out.println(map);


    }
}
