package com.neusoft.Practise.wushidaoti;

public class Seven {
    public static void main(String[] args) {
//       double length=0;
//        int h=100;
//        int n=10;
//        for(int i=0;i<n;i++){
//            length +=h;
//            h /=2.0 ;
//        }
//        System.out.println("经过第"+n+"次反弹后，小球共经过"+length+"米，"+"第"+n+"次反弹高度为"+h+"米");


        int h=100;
        double length=0;
        for (int i = 0; i <=10; i++) {
            length += h;
            h =h/2;
        }
        System.out.println("第10次反弹后，小球共经过"+length+"米"+" "+"第10次的反弹高度为"+h);
    }
}
