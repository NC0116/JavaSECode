package com.neusoft;

public class BreakAndContinueDemo02 {
    public static void main(String[] args) {
        //关于continue的入门案例
        //打印1-10之间 所有不是3倍数的整数
        for(int i=0;i<=10;i++){
            //判断该数字是否为3的倍数
            if (i % 3==0)
                continue;
            //如果不是3的倍数，我们就打印它
            System.out.println(i);

        }
    }
}
