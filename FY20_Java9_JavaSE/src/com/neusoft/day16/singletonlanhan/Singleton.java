package com.neusoft.day16.singletonlanhan;

public class Singleton {
    //就是实例在用到的时候去创建。比较懒
    
   private static  Singleton instance;
   private Singleton(){};
   public static Singleton getInstance(){
       //特点，只是第一次生成对象，效率较高
       if (instance == null){
           instance = new Singleton();
       }
       return instance;
   }
}
