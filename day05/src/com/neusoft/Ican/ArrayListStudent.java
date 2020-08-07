package com.neusoft.Ican;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListStudent {
    public static void main(String[] args) {
//        //创建学生数组
//        ArrayList<String> list = new ArrayList<>();
//
//
//        //创建学生对象
//        String s1 = "刘备";
//        String s2 = "孙权";
//        String s3 = "曹操";
////打印学生ArrayList集合
//        System.out.println(list);
//        //把学生对象作为元素添加到集
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
////打印学生ArrayList集
//        System.out.println(list);

//        ArrayList<Character> list = new ArrayList<>();
//        //添加元素
//
//        list.add('H');
//        list.add('I');
//        list.add('J');
//        //public E get(int index):返回指定索引处的元素
//        System.out.println("get:"+list.get(0));
//        System.out.println("get:"+list.get(1));
//        System.out.println("get:"+list.get(2));
//        System.out.println("===========================");
//        //public int size():返回集合中的元素的个数
//        System.out.println("size:"+list.size());
//        System.out.println("=======================");
//        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
//        System.out.println("remove:"+list.remove(2));
//        System.out.println("===========================");
//        //遍历输出
//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //生成6个1~33之间的随机整数,添加到集合,并遍历

        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 6; j++) {
            int n = r.nextInt(33) + 1;
            list.add(n);
        }
        Collections.sort(list);
             for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
