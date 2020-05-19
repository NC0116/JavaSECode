package com.neusoft;

public class TestEmpJavaBean {
    public static void main(String[] args) {
        EmpJavaBean emp = new EmpJavaBean("孙权", 3306, "Java工程师", 23999);
        System.out.println("姓名:"+ emp.getEmpName()+" "+"薪资："+emp.getSalary());
    }
}
