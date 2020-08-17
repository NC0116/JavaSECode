package com.neusoft.Practise.wushidaoti;

public class Three {
    public static void main(String[] args) {

        for (int i =100; i <999; i++) {
           if (is(i)==true){
               System.out.println(i);

           }
        }
    }
    public static boolean is(int i){
        int first = i % 100 % 10;
        int sec = (i % 100 - first) / 10;
        int th = (i - sec * 10 - first) / 100;
        int sum=0;
        sum=first*first*first+sec*sec*sec+th*th*th;
        if (i ==sum){
            return true;
        }else{
            return false;
        }

    }
//public static void main(String[] args){
//    for(int i=100;i<1000;i++){
//        if(isLotus(i))
//            System.out.print(i+" ");
//    }
//    System.out.println();
//}
//    private static boolean isLotus(int lotus){
//        int m = 0;
//        int n = lotus;
//        int sum = 0;
//        m = n/100;
//        n  -= m*100;
//        sum = m*m*m;
//        m = n/10;
//        n -= m*10;
//        sum += m*m*m + n*n*n;
//        if(sum==lotus)
//            return true;
//        else
//            return false;
//    }


}
