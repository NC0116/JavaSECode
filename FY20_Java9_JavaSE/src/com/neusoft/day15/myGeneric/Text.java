package com.neusoft.day15.myGeneric;

public class Text{
    public static void main(String[] args) {
        //创建一个泛型为String类
        MyGeneric<String> my = new MyGeneric<>();
        my.setMvp("哈登哥");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGeneric<Integer> my2 = new MyGeneric<>();
        my2.setMvp(13);
        Integer mvp2 = my2.getMvp();
        System.out.println(mvp2);
    }
}
