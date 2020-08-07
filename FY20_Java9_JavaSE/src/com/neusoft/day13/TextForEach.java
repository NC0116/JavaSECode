package com.neusoft.day13;

import java.util.ArrayList;

public class TextForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int a:arr){
            System.out.println(a);
        }

        ArrayList<String> list = new ArrayList<>();

        list.add("小鲁班");
        list.add("后裔");
        list.add("安其拉");
        for (String A :list){
            System.out.println("当前英雄是："+A);
        }
    }
}
