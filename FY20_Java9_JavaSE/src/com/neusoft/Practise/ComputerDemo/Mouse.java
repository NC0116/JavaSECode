package com.neusoft.Practise.ComputerDemo;

public class Mouse implements USB{


    public void click(){
        System.out.println("鼠标点击");
    }

    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }


}
