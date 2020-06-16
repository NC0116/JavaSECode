package com.neusoft;
//多态：是同一种行为的不同表现形式
import java.util.ArrayList;
import java.util.List;

public class DynamicTest01 {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();


        list.add(122);
        list.add(123);
        list.add(124);
        list.add(125);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            int a = 100;
            //变成double 100.00
            double b = 99.9; //----99
            //向上转型：格式 父类类型 对象名 = new 子类对象
            //向下转型;  格式 子类类型 对象名 =(子类类型 ) new 父类对象

        }
    }
}

