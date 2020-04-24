package com.neusoft;


//打印1~100 的质素,三行一输出
public class ForForDemo09 {
    public static void main(String[] args) {
        int count = 0;
        int flag = 3;
       a: for (int i = 2; i <=100 ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i%j == 0)
                   //走到这里， 说明不是质素
                    continue a;
            }
            System.out.print(i+(++count % flag == 0 ? "\n" : "\t"));
        }
    }
}
