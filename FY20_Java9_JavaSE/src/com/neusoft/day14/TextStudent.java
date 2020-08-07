package com.neusoft.day14;

import java.util.HashMap;

public class TextStudent {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("宋小宝",45),"大连");
        map.put(new Student("赵四",34),"葫芦岛");
        map.put(new Student("刘能",23),"沈阳");
        map.put(new Student("王天来",46),"营口");
        map.put(new Student("王天来",46),"营口");
        //遍历
        for (Student key : map.keySet()){
           String val =  map.get(key);
            System.out.println(key+"......"+val);

        }
    }


}
