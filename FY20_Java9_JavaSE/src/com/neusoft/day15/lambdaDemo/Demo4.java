package com.neusoft.day15.lambdaDemo;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("刘备",34),
                new Person("刘邦",33),
                new Person("刘禅",20),
                new Person("刘欢",38),

        };
        Arrays.sort(array,(Person a,Person b)->{
            return a.getAge()- b.getAge();
        });
        for (Person person : array){
            System.out.println(person);
        }
    }
}
