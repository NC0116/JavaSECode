package com.neusoft.day13;

import java.util.ArrayList;

public class TextCollection {
    public static void main(String[] args) {
        //使用多态形式创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //add
        list.add("小鲁班");
        list.add("ha");
        list.add("wo");
        System.out.println(list);
        //判断集合中是否包含给定的元素
        System.out.println(list.contains("wo"));//true
      System.out.println(list.contains("ha"));//true

        //把给定的元素从集中删除
        System.out.println(list.remove("ha"));
        System.out.println("删除之后" + list);

        //判断是否为空
        System.out.println(list.isEmpty());
        //返回集合中的个数
        System.out.println(list.size());
        Object[] objects = list.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }


        //清空集合中的所有元素
        list.clear();
        System.out.println(list);
    }
}
