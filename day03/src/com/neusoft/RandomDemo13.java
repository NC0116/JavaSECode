package com.neusoft;


//猜数字

import java.util.Random;
import java.util.Scanner;

public class RandomDemo13 {
    public static void main(String[] args) {
        Random random =  new Random();
        int guessNum= random.nextInt(100) +1;
        int inputNum  = 0;
        while (true){
           //提醒用户输入
           System.out.println("请输入您要猜的数字(1~100):");
           Scanner scanner = new Scanner(System.in);
           inputNum = scanner.nextInt();
           if (inputNum >guessNum )
               System.out.println("猜大了");
           else if(inputNum <guessNum)
               System.out.println("猜小了");
           else {
               System.out.println("恭喜你中奖了，你将获得柴刀一把");
               break;
           }
       }
    }
}
