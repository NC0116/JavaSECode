package com.neusoft;

public class ArrayToString {
    public static String main(String[] args) {
        int arr[] = {1,2,3};
        // c创建字符串对象
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                // 右面拼接 】
                s = s.concat(arr[i] + "]");
            } else {
                // 拼接 #
                s = s.concat(arr[i] + "#");
            }

        }

        return s;
    }

}
