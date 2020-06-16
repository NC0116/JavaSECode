package com.neusoft;

public class InnerDemoTest {
    public static void main(String[] args) {
        //创建外部类对象
        Person person= new Person();
        //创建内部对象
        //格式： 外部类名，内部类名  对象名 = new外部类型（）.new 内部类型（）；
        Person.Heart heart = person.new Heart();
        //调用内部类方法
        heart .jump();

        //调用外部类方法
        boolean live = person.isLive();
        System.out.println(live);
        person.setLive(false);

        heart.jump();


    }
}
