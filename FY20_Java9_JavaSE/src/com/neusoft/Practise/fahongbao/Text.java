package com.neusoft.Practise.fahongbao;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        Manager manager = new Manager("群主",200);
        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员1",0);
        Member member3 = new Member("成员1",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = scanner.nextInt();

        System.out.println("请输入发几个包");
        int count = scanner.nextInt();

        ArrayList<Integer> reList = manager.send(money, count);
        member1.receive(reList);
        member2.receive(reList);
        member3.receive(reList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
