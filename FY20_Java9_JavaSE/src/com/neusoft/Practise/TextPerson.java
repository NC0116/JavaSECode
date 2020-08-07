package com.neusoft.Practise;

import com.neusoft.day12.Person;
import org.w3c.dom.ls.LSOutput;

public class TextPerson{
    public static void main(String[] args) {
        Person p1 = new Person("张三",22);
        Person p2 = new Person("张三",22);
        Person p3= new Person("李四",22);
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

    }
}