package com.neusoft;

public class Zi extends Fu {
    int num = 6;

   
//    public void show(){
//        //想调用父类的成员变量，需要在前面加 super，不加super的话num = 6
//        System.out.println("Fu num =" +super.num ); //num = 6  , super.num = 5
//        System.out.println("Zi num =" + this.num); // num = 6  , this.num = 6
//    }
    //重写父类的方法，建议使用该注解进行标识
    @Override
    public void show(){
        System.out.println("zi类的show方法执行");
    }
}
