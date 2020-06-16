package com.neusoft;

public interface LiveAble {
    //静态方法的使用
    public static void run(){
        System.out.println("跑起来");

    }
    //public void run();
    //将func1 和func2两个方法封装默认方法中func

    default void func(){
        func1();
        func2();
    }
    //私有方法
    private void func1(){
        System.out.println("func1跑起来");
    }

    //func2
    private void func2(){ System.out.println("func2跑起来"); }


    //多时现抽象方法重名
    public void show();
//    //多实现默认方法重名
//    public default void method(){
//      System.out.println("Liveable");
//   }
}
