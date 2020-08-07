package com.neusoft.day14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //Map的常用子类
      //  HashMap 和 LinkedHashMap
        //创建对象
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("刘备","孙尚香");
        map.put("周瑜","大乔");

//        //访问
//        String s = map.get("刘备");
//        System.out.println(s);
//
//        //删除
//        String s1 = map.remove("周瑜");
//        System.out.println(s1);
//        System.out.println(map);
//        //获取集合中所有的键
//        Set<String> s2 = map.keySet();
//        for (String key : s2) {
//            String val  = map.get(key);
//            System.out.println(key+"和"+val+"是一对");
//
//            String s3 = map.get(1);
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            //遍历
            for (Map.Entry<String, String> entry: entrySet){
                String key1= entry.getKey();
                String value = entry.getValue();
                System.out.println(key1+"="+value);
            }

    }

}
