package com.neusoft.day14.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TextCar {
    public static void main(String[] args) {
        HashMap<Car, Integer> map = new HashMap<>();
        Car c1 = new Car("长安奔奔", "黄色");
        Car c2 = new Car("奇瑞QQ", "黑色");
        Car c3 = new Car("奇瑞QQ", "黑色");

        map.put(c1,100000);
        map.put(c2,123456);
        map.put(c3,123456);
        //keySet方法判断
        Set<Car> keySet = map.keySet();
        for (Car c:keySet){
            Integer val = map.get(c);
            System.out.println(c.getName() + ","+ c.getColor()+ ","+ " 价格："+ val);
        }

        //entry方法判断
        Set<Map.Entry<Car, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Car, Integer> entry :entrySet){
            Car key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key.getName()+","+key.getColor()+","+val);


        }



    }
}
