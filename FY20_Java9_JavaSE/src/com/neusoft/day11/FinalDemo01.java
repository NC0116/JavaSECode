package com.neusoft.day11;

public class FinalDemo01 {
    public static void main(String[] args) {
        // 声明一个变量，被final修饰
        final int a;
        a = 10;
        // a = 20; 不可以

        final  int b = 20;
        // b = 20; 不可以
    /*    final int c = 0;
                 for (int i = 0; i < 10 ; i++) {
                c = i;
                System.out.println(c);
        }
*/
        for (int i = 0; i < 10 ; i++) {
            final int c = i;
            System.out.println(c);

        }
    }

}
