package com.neusoft.jdbc.studentAdmin;

import com.neusoft.jdbc.studentAdmin.dao.Impl.StudentDaoImpl;
import com.neusoft.jdbc.studentAdmin.dao.StudentDao;
import com.neusoft.jdbc.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/6 15:47
 */
public class MainStudent {
    public static void main(String[] args) {
        System.out.println("-------- 欢迎登录low版学生管理系统---------");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("----------学生列表------------------------");
        List<Student> list = studentDao.findAll();
        for (Student s:list){
            System.out.println(s);
        }
        System.out.println("----------保存学生------------------------");

        Student student = new Student();
        student.setId(2);
        student.setName("李四");
        student.setScore(90);
        student.setAddr("沈阳");
        student.setGender("男");
        student.setTel("167");
      studentDao.save(student);

        }
//

        // new Student
//        studentDao.save();



        // 修改



        // 删除

    }

