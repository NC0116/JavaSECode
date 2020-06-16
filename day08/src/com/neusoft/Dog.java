package com.neusoft;

public class Dog extends Animal implements LiveAble, Pet {
    //多实现的格式
    // class 类名 [extends 父类名] implements 接口1，接口2，......{
    //必须重新接口中所有的抽象方法
    //重新接口中的默认方法
//}


    @Override
    public void shouyang() {
    }

    @Override
    public void eat() {
        System.out.println("Dog在哐哐造狗粮");
    }

    @Override
    public void show() {
        System.out.println("show()重写");
    }

    @Override
    public void method() {
        System.out.println("Dog");
    }
}
