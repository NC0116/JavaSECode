package com.neusoft.day14;

import java.util.ArrayList;
import java.util.Collections;

public class Poker1 {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers, "♥", "♦", "♠", "♣");
        Collections.addAll(colors, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        for (String number : numbers) {
            for (String color : colors) {
                String card =number +color;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        System.out.println(pokerBox);
        Collections.shuffle(pokerBox);
        System.out.println(pokerBox);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i >= 51) {
                dipai.add(card);
            } else if (i % 3 == 0) {
                player1.add(card);

            } else if (i % 3 == 1) {
                player2.add(card);

            } else {
                player3.add(card);
            }

        }
        System.out.println("刘邦" + player1);
        System.out.println("朱元璋" + player2);
        System.out.println("刘备" + player3);
        System.out.println("底牌" + dipai);


    }
}
