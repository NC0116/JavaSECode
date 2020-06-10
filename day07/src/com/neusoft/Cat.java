package com.neusoft;

public class Cat extends Animal {
    private String name;
    //无参构造函数
    Cat(){
        super();
        System.out.println(" Cat()");
    }
    Cat(String name){
        super();
        //super();1.子类中每个均有super(),用来调用父类空参数构造
        //2.  手动调用父类的狗仔会覆盖默认的super()
        //3.super()必须在构造方法的第一行
        this.name= name;
        System.out.println(" Cat(name)");
    }

    @Override
    public void eat() {
        System.out.println("cat:eat");
    }
    public void eatTest(){
        this.eat();//调用本类的方法
        super.eat();//调用父类的方法
    }
}
