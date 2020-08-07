package com.neusoft.day13;

import java.util.Arrays;

public class TextSystem2 {
    public static void main(String[] args) {
        // 将 src 中前 3个元素， 赋值到dest的前3个位置上
        //  操作之后： [1, 2, 3, 4, 5]  dest [1, 2, 3, 9, 10]
        int[] src = new int[]{1, 2, 3, 4, 5};
        int[] dest = new int[]{6, 7, 8, 9, 10};
        System.arraycopy(src, 0, dest, 0, 3);

        System.out.println(Arrays.toString(dest));

        int[] src1 = new int[]{1,2,3};
        int[] dest1 = new int[]{6,7,7};
        System.arraycopy(src1,0,dest1,0,3);
        System.out.println(Arrays.toString(dest1));




    }

}
