package com.neusoft;

public class InnerDemoTest04 {

        public static void main(String[] args) {
//       实际开发中常用的形式
            showFly(new FlyAble(){
                @Override
                public void fly() {
                    System.out.println("我要起飞了");
                }
            });

        }

        public static void showFly(FlyAble f){
            f.fly();
        }


}

