package com.neusoft.day15.lambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TextPerson {
    public static void main(String[] args) {
        Person[] array = {
                new Person("刘备",34),
                new Person("刘邦",33),
                new Person("刘禅",20),
                new Person("刘欢",38),


        };
        Comparator<Person> comp =  new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        Arrays.sort(array,comp);
        System.out.println(Arrays.toString(array));

    }
}
