package com.neusoft.jdbc.empselectDemo;

import com.neusoft.jdbc.empselectDemo.domain.Emp;
import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEmp {
    public static void main(String[] args) {
            List<Emp> list = new JDBCEmp().findAllUseJDBCUtils();
            for (Emp emp:list) {
                System.out.println(emp);
            }
        }
//        public List<Emp> findAll(){
//            Connection conn = null;
//            Statement stmt = null;
//            ResultSet rs = null;
//            ArrayList<Emp> list = null;
//            try {
//                conn = DriverManager.getConnection(
//                        "jdbc:mysql://localhost:3306/java9", "root", "root");
//
//                String sql = "select * from account;";
//                stmt = conn.createStatement();
//                // 封装查询结果
//                rs = stmt.executeQuery(sql);
//                list = new ArrayList<>();
//
//                // 类似于迭代器
//                // 让游标移动一下
//                while (rs.next()) {
//                    int id = rs.getInt("empno");
//                    String name = rs.getString("ename");
//                    String job = rs.getString("job");
//                    int mgr = rs.getInt("mgr");
//                    Date hiredate = rs.getDate("hiredate");
//                    int salary  = rs.getInt("sal");
//                    int bonus = rs.getInt("comm");
//                    int deptno = rs.getInt("deptno");
//
//                    //封装 入emp
////                Emp emp = new Emp();
////                  emp.setId(id);
////                  emp.setEname(name);
////                  emp.setJob(job);
////                  emp.setMgr(mgr);
////                  emp.setHiredate(hiredate);
////                  emp.setSalary(salary);
////                  emp.setBonus(bonus);
////                  emp.setDeptno(deptno);
////                  list.add(emp);
////            }
//
//                } catch (ClassCastException e) {
//
//                    e.printStackTrace();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                } finally {
//                    // 释放资源
//
//                    if (stmt != null) {
//                        try {
//                            stmt.close();
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    if (conn != null) {
//                        try {
//                            conn.close();
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    if (rs != null) {
//                        try {
//                            conn.close();
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//
//                }
//                return list;
////    }
//            }
    /**
     * 演示JDBCUtils
     */
    public List<Emp> findAllUseJDBCUtils() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            conn = JDBCUtils.getConnection();
            // 定义sql
            String sql = "select * from emp limit 10;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                // 封装 入emp
                Emp emp = new Emp();
                emp.setId(id);
                emp.setName(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSal(sal);
                emp.setComm(comm);
                emp.setDeptno(deptno);
                // 添加进集合
                list.add(emp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt, conn, rs);
        }
        return list;
    }
}