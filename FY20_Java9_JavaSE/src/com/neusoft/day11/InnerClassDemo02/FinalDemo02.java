package com.neusoft.day11.InnerClassDemo02;

public class FinalDemo02 {
    public static void main(String[] args) {

        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("嗷嗷飞");
            }
        });

    }

    public static void showFly(FlyAble flyAble){
        flyAble.fly();
    }
}
