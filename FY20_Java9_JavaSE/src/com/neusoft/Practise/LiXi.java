package com.neusoft.Practise;

        import java.util.Arrays;
        import java.util.Scanner;

public class LiXi {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        String s[]=str.split(",");
        int A=Integer.parseInt(s[0]);
        int B=Integer.parseInt(s[1]);
        int a=Integer.parseInt(s[2]);
        int b=Integer.parseInt(s[3]);

        int arr[] =new int[A];
        int brr[] =new int[B];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i <brr.length; i++) {
            brr[i]=i+1;
        }

        int maxArr[]=new int[arr.length*brr.length];
        int in=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                maxArr[in]=arr[i]*brr[j];
                in++;
            }
        }
        Arrays.sort(maxArr);
        int max=maxArr[arr.length*brr.length-1];
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i]/brr[j] == a/b && arr[i]*brr[j]==max){
                    System.out.println(arr[i]+""+brr[j]);
                    flag=false;
                }
            }
        }
        if (flag){
            System.out.println("0 0");
        }
    }


}
