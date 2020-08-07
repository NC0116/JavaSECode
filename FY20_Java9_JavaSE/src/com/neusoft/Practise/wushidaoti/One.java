package com.neusoft.Practise.wushidaoti;

import java.util.Scanner;

public class One {
    public static void main(String[] ages){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入月数：");
        int n=scanner.nextInt();

        System.out.println("第"+n+"个月兔子总数为"+fun(n));
        }
        private static int fun(int n){
            if(n==1 || n==2)
                return 1;
            else
                return fun(n-1)+fun(n-2);
        }

        }

