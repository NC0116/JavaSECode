package com.neusoft;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，小灯闪闪闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，小灯熄灭");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
