package com.neusoft.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    //创建Map对象
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers, "♥","♦","♠","♣");
        Collections.addAll(colors, "2","3","4","5","6","7","8","9","10","J","Q","K","A");

        int count = 1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");

        for (String color: colors) {
            for (String number : numbers){
                String card=  color+number;
                pokerMap.put(count++,card);
            }
        }
        System.out.println(pokerMap);

        //打乱顺序
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        System.out.println(numberList);


        //不发牌，发编号
        ArrayList<Integer> pu1= new ArrayList<>();
        ArrayList<Integer> pu2= new ArrayList<>();
        ArrayList<Integer> pu3= new ArrayList<>();
        ArrayList<Integer> pu4= new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            Integer no= numberList.get(i);
            if (i>=51){
                pu4.add(no);
            }else if(i % 3 == 0){
                pu1.add(no);

            }else if (i% 3 == 1) {
                pu2.add(no);
            }else {
                pu3.add(no);
            }
        }

        //编号排序
        Collections.sort(pu1);
        Collections.sort(pu2);
        Collections.sort(pu3);
        Collections.sort(pu4);


        //创建玩家集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i : pu1){
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (int i : pu2){
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (int i : pu3){
            String card = pokerMap.get(i);
            player3.add(card);
        }
        for (int i : pu4){
            String card = pokerMap.get(i);
            dipai.add(card);
        }
        System.out.println("马云1"+player1);
        System.out.println("马云2"+player2);
        System.out.println("马云3"+player3);
        System.out.println("底牌"+dipai);




    }

}