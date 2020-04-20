package com.neusoft;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//break 跳出本层循环
//continue 用来结束本次循环，进行下一次循环
//入门案例 打印十次HelloWorld, 第六次时结束循环
public class BreakAanContinueDemo01 {
    public static void main(String[] args) {
        System.out.println("start:");
   //定义10次循环
        for(int i= 1; i<=10; i++){
            //判断i=6的时候， 结束循环
            if(i==6)
                break;
            System.out.println("HelloWorld"+i);
        }
        System.out.println("end");
    }

}
