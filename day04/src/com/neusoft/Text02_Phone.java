package com.neusoft;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Text02_Phone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //输出成员变量
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println("================");
        //赋值
        p.brand = "Apple11pro";
        p.color= "green";
        p.price = 9999;
        show(p);
        //再次输出
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println("===============");
        //调用打电话方法
        p.call("马云");
        //调用发短信方法
        p.sendMessage();
    }
    //把对象作为参数进行传递
    public static void show(Phone p){
        System.out.println(p.brand+p.color+p.price);
    }


}
