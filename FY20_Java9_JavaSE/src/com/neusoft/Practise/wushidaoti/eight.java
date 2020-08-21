package com.neusoft.Practise.wushidaoti;

public class eight {
    public static void main(String[] args) {
        int n=0;
        int count = 0;
        for (int i = 1; i <5; i++) {
            for (int j = 1; j <5; j++) {
                for (int k = 1; k < 5; k++) {
//                    if (j==i){
////                        continue;
////                    }
                    if (k!=i && k!=j && i!=j){
                        n =i*100+j*10+k;
                        System.out.print(n+" ");
                        if (++count % 5==0){
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("数量是："+count);
    }
}
