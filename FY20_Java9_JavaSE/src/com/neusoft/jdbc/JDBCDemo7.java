package com.neusoft.jdbc;

import com.neusoft.jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCDemo7 {
    public static void main(String[] args) {

        //注册
//       Class.forName("com.mysql.jdbc.Driver");
//       //创建连接数据库的对象connection

        List<Emp> list = new JDBCDemo7().findAll();
        for (Emp emp:list) {
            System.out.println(emp);
        }
    }
    public List<Emp> findAll(){
        Connection conn =null;
        Statement stmt = null;
        ResultSet rs =null;
        ArrayList<Emp> list=null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

            System.out.println(conn);
            //定义sql
            String sql = " select * from empl ;";
            //创建执行sql对象 statement
           stmt = conn.createStatement();
           //封装查询结果'
           // int count = stmt.executeUpdate(sql);
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while(rs.next()){
               int id = rs.getInt("empno");
               String name = rs.getString("ename");
               String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate=rs.getDate("hiredate");
                int comm = rs.getInt("comm");
                int sal = rs.getInt("sal");
                int deptno = rs.getInt("deptno");

                Emp emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setComm(comm);
                emp.setDeptno(deptno);
                list.add(emp);

            }



//
//
//
//
//  执行的返回结果
//            int count = stmt.executeUpdate(sql);
//
//            if (count > 0) {
//                System.out.println("添加成功");
//            } else {
//                System.out.println("添加失败");
//            }
        }catch ( ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (rs !=null){
                try{
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


//            //释放资源
//
//            stmt.close();
//            conn.close();

            return list;
    }
}

