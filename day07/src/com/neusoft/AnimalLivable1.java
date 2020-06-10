package com.neusoft;

public class AnimalLivable1 implements Livable1 {
    //继承什么都可以不用写，直接调用即可
//    @Override
//    public void fly() {
//    }
    //重写
    @Override
    public void fly(){
        System.out.println("骄傲的飞");
    }
}
