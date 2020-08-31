package com.neusoft.Practise.fahongbao;


import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int leftMoney) {
        super(name, leftMoney);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getLeftMoney();
        // 判断
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
        }
        // 扣钱
        super.setLeftMoney(leftMoney-totalMoney);
        // 每个人发的钱
        int avg = totalMoney/count;
        // 除不开余出来的钱
        int mod = totalMoney%count;

        for (int i = 0; i <count-1 ; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }

}

