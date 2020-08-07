package com.neusoft.day13.doudizhu;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(listTest(list,2));
    }
    public static int listTest(ArrayList<Integer> al, Integer s){
        for (int i = 0; i <al.size() ; i++) {
            if(al.get(i).equals(s)){
            return i;
            }
        }
        return -1;
    }
}
