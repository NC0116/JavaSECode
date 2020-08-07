package com.neusoft.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //添加
        map.put("1","苹果");
        map.put("2","华为");
        map.put("3","小米");
        System.out.println(map);
        System.out.println("============================");

        //访问
        String s = map.get("1");
        System.out.println(s);
        System.out.println("============================");

        //删除
        String remove = map.remove("1");
        System.out.println(remove);

        //判断是否包含指定的键
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsKey("1"));
        System.out.println("============================");

        //获取所有的键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String val = map.get(key);
            System.out.println(key+"和"+val+"是一对");
        }
        System.out.println("============================");

        // // 获取所有的entry对象
        Set<Map.Entry<String, String>> entrySet= map.entrySet();
        // 遍历每一个entry对象
        for (Map.Entry<String, String> entry:entrySet){
            String key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println(key1 +"="+value);
        }


    }

}
