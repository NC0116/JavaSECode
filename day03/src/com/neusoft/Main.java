package com.neusoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 5; i++) {      //外循环, 控制行.    i的值: 1,
                    for (int j = 1; j <= 5 ; j++) { //内循环, 控制列.    j的值: 1,2,3(整个循环结束)
                        if (j == 3) {
                            break;   //这个break, 是用来结束哪个循环呢?
                        }
                        System.out.print("*");
                    }
                    System.out.println();
        }
    }
}
