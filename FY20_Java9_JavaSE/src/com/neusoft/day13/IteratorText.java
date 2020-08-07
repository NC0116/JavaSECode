package com.neusoft.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorText {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //add
        coll.add("小鲁班");
        coll.add("ha");
        coll.add("wo");
        //遍历
        Iterator<String> iterator = coll.iterator();
        //iterator.hasNext())判断是否有迭代元素

        while(iterator.hasNext() == true){
            // 获取迭代的 元素
             String s= iterator.next();
            System.out.println(s);
        }
    }

}
