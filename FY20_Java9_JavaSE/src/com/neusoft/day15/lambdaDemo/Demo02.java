package com.neusoft.day15.lambdaDemo;

public class Demo02 {
    public static void main(String[] args) {
        invoke(()-> {

                System.out.println("返好了");


        });
    }
    public  static void invoke(Cook cook){
        cook.markFood();
    }

}