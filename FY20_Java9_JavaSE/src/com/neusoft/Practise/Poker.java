package com.neusoft.Practise;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args){
        //创建牌盒、数字、花色集合
        ArrayList<String> pokBox = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        //添加数字、花色到集合
        Collections.addAll(colors,"♣","♦","♥","♠");
        Collections.addAll(numbers,"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        //拼接花色到牌盒中
        for (String number:numbers){
            for (String color :colors) {
                String card=number+color;
                pokBox.add(card);

            }
        }
        //添加大王、小王
        pokBox.add("大王");
        pokBox.add("小王");
        System.out.println(pokBox);

        //打乱顺序
        Collections.shuffle(pokBox);
        System.out.println(pokBox);

       // 创建玩家底牌集合，遍历获取发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2= new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < pokBox.size(); i++) {
            String card = pokBox.get(i);
            if (i >= 51){
                dipai.add(card);
            }else if (i % 3==0){
                player1.add(card);
            }else if (i %3==1){
                player2.add(card);
            }else {
                player3.add(card);
            }
        }
        //输出发牌结果
        System.out.println("马云"+player1);
        System.out.println("马化腾"+player2);
        System.out.println("我"+player3);
        System.out.println("底牌"+dipai);
    }
}
