package com.neusoft;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("小刀", 18);
        System.out.println(student1);
        System.out.println(student);

    }
}

