package com.neusoft.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","华为");
        map.put("2","小米");
        map.put("3","苹果");
//        System.out.println(map);
//
//        //访问
//        String s = map.get("1");
//
//        System.out.println(s);
//        //删除
//        String s1 = map.remove("1");
//        System.out.println(s1);
//        System.out.println(map);
//
//        //获取集合所有的键
//        Set<String> key1 = map.keySet();
//
//        for (String key : key1 ) {
//            String val  = map.get(key);
//            System.out.println(key+"和"+val+"是一对");

            //获取所有的entry
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            //遍历
            for (Map.Entry<String, String> entry: entrySet){
                String key2= entry.getKey();
                String value = entry.getValue();
                System.out.println(key2+"="+value);
            }




    }
}
