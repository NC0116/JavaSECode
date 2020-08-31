package com.neusoft.Practise.wushidaoti;

public class Nine {
    public static void main(String[] args) {
////        【程序13】
////        题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
////        程序分析：在10万以内判断，先将该数加上100后再开方，
////        再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
            int n=0;
        for (int i = 0; i <100001; i++) {
            double a=Math.sqrt(i+100);
            double b=Math.sqrt(i+168);
            int c=(int)a;
            int d =(int)b;
//            Math.pow(c，2)c的平方
            if (i+100==c*c && i+168==d*d){
                n=i;
                System.out.println();
            }
        }
    }
}
