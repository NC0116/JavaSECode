package com.neusoft.jdbc.studentAdmin.dao.Impl;

import com.neusoft.jdbc.empselectDemo.domain.Emp;
import com.neusoft.jdbc.studentAdmin.dao.StudentDao;
import com.neusoft.jdbc.studentAdmin.domain.Student;
import com.neusoft.jdbc.studentAdmin.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/6 15:59
 */
public class StudentDaoImpl  implements StudentDao {

    @Override
    public List<Student> findAll() {

            Statement stmt = null;

            ResultSet rs = null;
            Connection conn = null;
            ArrayList<Student> list=null;
            try {
                conn = JDBCUtils.getConnection();

                String sql = " select * from studentmanage ;";
                stmt= conn.createStatement();
                rs = stmt.executeQuery(sql);
                list = new ArrayList<>();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String gender = rs.getString("gender");
                    int score = rs.getInt("score");
                    String addr = rs.getString("addr");
                    String tel = rs.getString("tel");

                    Student st = new Student();
                    st.setId(id);
                    st.setName(name);
                    st.setGender(gender);
                    st.setScore(score);
                    st.setAddr(addr);
                    st.setTel(tel);
                    list.add(st);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
               JDBCUtils.close(stmt,conn,rs);
            }
            return list;
        }


    @Override
    public void save(Student student) {
        Connection conn = null;
        Statement    stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;
            try{
                conn = com.neusoft.jdbc.utils.JDBCUtils.getConnection();
                 student.getId();


                String sql2 = "insert into studentmanage values(getId); ";
                stmt1 = conn.createStatement();
                stmt2 = conn.createStatement();
                Student student1 = new Student();



               int count2 = stmt2.executeUpdate(sql2);
return ;

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                JDBCUtils.close(stmt1, conn);
            JDBCUtils.close(stmt2, conn);
            }
    }


    @Override
    public void remove(Integer id) {
        Connection conn = null;
        Statement    stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;
        try{
            conn = com.neusoft.jdbc.utils.JDBCUtils.getConnection();
            String sql1 = "insert into studentmanage values(?); ";
            String sql2 = "insert into studentmanage values(?); ";
            stmt1 = conn.createStatement();
            stmt2 = conn.createStatement();
            // 设置参数

            int count = stmt1.executeUpdate(sql1);
            int count2 = stmt2.executeUpdate(sql2);
            System.out.println("count"+ count + "count2"+count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt1, conn);
            JDBCUtils.close(stmt2, conn);
        }
    }

    @Override
    public void update(Student student) {
        Connection conn = null;
        Statement    stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;
        try{
            conn = com.neusoft.jdbc.utils.JDBCUtils.getConnection();
            String sql1 = "insert into studentmanage values(?); ";
            String sql2 = "insert into studentmanage values(?); ";
            stmt1 = conn.createStatement();
            stmt2 = conn.createStatement();
            // 设置参数

            int count = stmt1.executeUpdate(sql1);
            int count2 = stmt2.executeUpdate(sql2);
            System.out.println("count"+ count + "count2"+count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt1, conn);
            JDBCUtils.close(stmt2, conn);
        }
    }
}