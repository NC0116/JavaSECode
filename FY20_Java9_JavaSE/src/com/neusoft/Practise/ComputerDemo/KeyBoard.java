package com.neusoft.Practise.ComputerDemo;

public class KeyBoard implements USB {

    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
    public void input(){
        System.out.println("键盘输入");
    }

}
