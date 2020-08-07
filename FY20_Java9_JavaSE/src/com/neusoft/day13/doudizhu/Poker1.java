package com.neusoft.day13.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker1 {
    public static void main(String[] args) {
        //
        List<String> pokerBox = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♣");
        colors.add("♠");
        colors.add("♦");
        for (int i = 2; i <=10 ; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //生产牌
        for (String color : colors){
            for (String number: numbers){
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");

        Collections.shuffle(pokerBox);
        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i <pokerBox.size() ; i++) {
            String card = pokerBox.get(i);
            if (i>=51){
                dipai.add(card);
            }else if (i %3==0){
                player1.add(card);
            }else if (i % 3 ==1){
                player2.add(card);
            }else {
                player3.add(card);
            }

        }
        System.out.println("王的牌"+player1);
        System.out.println("马的牌"+player2);
        System.out.println("我的牌"+player3);
        System.out.println("底牌"+dipai);

    }
}
