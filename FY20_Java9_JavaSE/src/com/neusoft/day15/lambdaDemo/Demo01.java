package com.neusoft.day15.lambdaDemo;

public class Demo01 {
    public static void main(String[] args) {
        //格式： （参数类型 参数名称）--》{代码语句}
        invoke(new Cook() {
            public void markFood(){
                System.out.println("返好了");
            }

        });
    }
    public  static void invoke(Cook cook){
        cook.markFood();
    }

}
