package com.neusoft.day13.doudizhu;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//斗地主 的洗牌和发牌动作
//规则： 使用54张牌打乱顺序 ，三个玩家参与游戏， 每人17张牌 最后剩三张底牌
// -准备牌： 每张牌由花色 和数字组成
//- 发牌
//- 看牌
public class Poker {
    public static void main(String[] args) {
        // -准备牌： 每张牌由花色 和数字组成
        //创建牌盒，存储牌
        List<String> pokerBox = new ArrayList<>();
        //数字集合
        List<String> numbers = new ArrayList<>();
        //花色集合
        List<String> colors = new ArrayList<>();

        //添加花色
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //生产牌，拼接花色和数字
        for (String color : colors) {
            //每次拿到一种花色
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        //System.out.println(pokerBox);
        //洗牌
        Collections.shuffle(pokerBox);
        //System.out.println(pokerBox);

        //发牌

        ArrayList<Object> player1 = new ArrayList<>();
        ArrayList<Object> player2 = new ArrayList<>();
        ArrayList<Object> player3 = new ArrayList<>();
        ArrayList<Object> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            //判断i值， 先判断
            if (i >= 51) {
                dipai.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }
        }
        System.out.println("王" + player1);
        System.out.println("马" + player2);
        System.out.println("我" + player3);
        System.out.println("底牌" + dipai);
    }
}
