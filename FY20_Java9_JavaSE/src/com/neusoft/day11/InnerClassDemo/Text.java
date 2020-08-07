package com.neusoft.day11.InnerClassDemo;

public class Text {
    public static void main(String[] args) {
        // 外部类名.内部类名 对象名  = new 外部类型（）.new 内部类型（）；
        Person p = new Person();
        Person.Heart heart =  p.new Heart();
//        Person.Heart heart =  new Person().new Heart();
        heart.jump();
        p.setLive(false);
        heart.jump();
    }
}
