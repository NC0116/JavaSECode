package com.neusoft;

import java.util.Random;

//随机种子 seed
//作用是重新设置random对象的种子数
//设置完种子以后的Random 对象和相同的种子数
//new  创建出来的对象相同
public class RandomDemo11 {
    public static void main(String[] args) {
       // Random random =  new Random(666);
        Random random =  new Random();
        random.setSeed(666);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
