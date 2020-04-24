package com.neusoft;

public class ForForDemo06 {
    //打印矩形 3 x 5
    //外层负责换行， 里层负责打印每一行的内容
    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
