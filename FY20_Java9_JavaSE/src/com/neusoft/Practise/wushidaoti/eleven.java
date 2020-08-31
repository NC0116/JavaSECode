package com.neusoft.Practise.wushidaoti;

import java.util.Arrays;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
//        题目：输入三个整数x,y,z，请把这三个数由小到大输出。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数：");
        int one= scanner.nextInt();
        int two= scanner.nextInt();
        int three= scanner.nextInt();
        int[] ints = new int[3];
        ints[0]=one;
        ints[1]=two;
        ints[2]=three;
        Arrays.sort(ints);
        for (int i = 0; i <ints.length ; i++) {
            int num=ints[i];
            System.out.print(num+" ");
        }

    }
}
