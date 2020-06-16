package com.neusoft;

public class InnerDemoTest02 {
    public static void main(String[] args) {
       FlyAble f =  new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        };
       //调用fly方法
        f.fly();
    }
}
