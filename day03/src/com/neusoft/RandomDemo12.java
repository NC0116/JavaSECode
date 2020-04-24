package com.neusoft;

import java.util.Random;

public class RandomDemo12 {
    public static void main(String[] args) {
        // Random random =  new Random(666);
        Random random =  new Random();
        random.setSeed(666);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
