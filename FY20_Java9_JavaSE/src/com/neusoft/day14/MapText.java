package com.neusoft.day14;

import java.util.HashMap;
import java.util.Scanner;

public class MapText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String i = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j< i.length() ; j++) {
            char c = i.charAt(j);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer count  = map.get(c);
                map.put(c,++count);

            }

        }
        System.out.println(map);

    }
}
