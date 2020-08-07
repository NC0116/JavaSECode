package com.neusoft.Practise.ComputerDemo;

public class Computer {
    //包含运行
    public void run(){
        System.out.println("电脑开启");
    }

    //关机
    public void shutdown(){
        System.out.println("电脑关闭");
    }

    //使用USB
    public static void useUSB(USB usb){
        if (usb !=null){
            usb.open();
            if (usb instanceof Mouse){
                Mouse m=(Mouse)usb;
                m.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard kb= (KeyBoard)usb;
                kb.input();
            }
            usb.close();
        }
    }
    //当电脑对象调用使用这个方法是时，必须给其一个符合USB规则的USB设备
        //判断是否有usb
            //进行类型转换， 调用特有的方法



}

