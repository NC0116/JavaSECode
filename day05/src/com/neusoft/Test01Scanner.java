package com.neusoft;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Test01Scanner {
    // 1.键盘录入两个数据并求和
    /**
     public static void main(String[] args) {
     // 创建对象
     Scanner scanner =  new Scanner(System.in);
     // 接收数据
     System.out.println("请输入第一个数据: ");
     int a = scanner.nextInt();
     System.out.println("请输入第二个数据:");
     int b = scanner.nextInt();
     // 对数据进行求和
     int sum= a +b;
     System.out.println("sum:"+sum);
     }
     */
    // 2.键盘录入三个数据并获取最大值

    /**
     * public static void main(String[] args) {
     * Scanner scanner =  new Scanner(System.in);
     * System.out.println("请输入第一个数据:");
     * System.out.println("请输入第二个数据:");
     * System.out.println("请输入第三个数据:");
     * int a = scanner.nextInt();
     * int b = scanner.nextInt();
     * int c = scanner.nextInt();
     * // 获取这三个数的最大值
     * int temp= (a>b ? a:b);
     * int max= (temp >c ? temp:c);
     * System.out.println("max:"+max);
     * }
     */

    // 匿名对象，（没有名的对象） 只创建对象语句， 没有把对象地址值赋值给某个变量
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        // 这就是匿名对象的创建，有点，简洁
        System.out.println(new Scanner(System.in).nextInt());
        // 缺点： 一旦调用两次成员方法， 就创建了两个对象，造成了浪费
//        new Scanner(System.in).nextInt();
//        new Scanner(System.in).nextInt();

    }
}
