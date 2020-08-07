package com.neusoft.day15.yichang;

import java.nio.file.FileAlreadyExistsException;

public class TryCatch {
//    try{
//        编写可能出现异常的代码
//    }catch（异常处理 e）{
//处理异常的代码
//    }
public static void main(String[] args) {
    try{
        read("xiaomiMi.txt");
    }catch(Exception e){
        //在try中抛出什么异常，在括号中就捕获什么异常
        //e.printStackTrace();
        System.out.println("++++++++++");
        System.out.println(e);

    }finally {
        System.out.println("不管try和catch执行啥了，我这里都会执行");
        System.out.println("我是接盘侠");
    }
    System.out.println("end");
    }
    public static void read(String path) throws FileAlreadyExistsException {
        if (!path.equals("xiaomimi.txt")) {
        throw new FileAlreadyExistsException("你的文件消失了");
        }
    }

}
