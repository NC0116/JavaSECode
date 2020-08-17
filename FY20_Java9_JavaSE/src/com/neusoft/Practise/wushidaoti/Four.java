package com.neusoft.Practise.wushidaoti;

import java.util.Scanner;

public class Four {
    static int n,k = 2;
    public static void main(String[] args) {
            System.out.print("请输入一个大于2的正整数：");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.print(n+"=" );
            while(n!=k) {
                if(n%k == 0) {
                    n = n/k;
                    System.out.print(k+"*");
                }
                else {
                    k++;
                }
            }
            System.out.print(n);
        }

}
