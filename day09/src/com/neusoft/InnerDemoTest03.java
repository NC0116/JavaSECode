package com.neusoft;

public class InnerDemoTest03 {
    public static void main(String[] args) {
        /**
         * 1.等号右边 ，定义并创建该接口的子类对象
         * 2.左边 ，是多态， 接口类型引用指向子类对象
         */
        FlyAble f =new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        };
        //将带有匿名内部类作为方法的参数进行传递
        showFly(f);
    }

    public static void showFly(FlyAble f){
        f.fly();
    }
}
