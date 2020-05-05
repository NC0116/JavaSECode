package com.neusoft;

public class Text03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("Good!");
        System.out.println(studentInfo.getName());
        System.out.println("-------------------------------");
        System.out.println(studentInfo.getAge());
        studentInfo.setAge(108);
        System.out.println(studentInfo.getAge());
    }
}
