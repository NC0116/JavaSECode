package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCLoginDemo {
    public static void main(String[] args) {
//        //键盘录入用户名和密码
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入用户名:");
//        String userName = scanner.next();
//        System.out.println("请输入密码：");
//        String passWord = scanner.next();
//        // 编写一个方法 login 判断用户用户名和密码是否正确
//
////        boolean flag = new JDBCLoginDemo().login(userName, passWord);
////        if (flag){
////            System.out.println("登录成功！");
////        }else {
////            System.out.println("用户名或密码错误!");
////        }
////    }
//
////    private boolean login(String userName, String passWord) {
////        // 判断是否为空
////        if (userName == null || passWord ==null ){
////            return false;
////        }
////        Connection conn = null;
////        Statement stmt = null;
////        ResultSet rs = null;
////        try{
////            conn = JDBCUtils.getConnection();
////            // sql
////            String sql="select * from user where username='"+userName+"'and password='"+passWord+"'";
////            System.out.println(sql);
////
////           stmt = conn.createStatement();
////           rs = stmt.executeQuery(sql);
////            return rs.next();
////
////
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////
////        }finally {
////            JDBCUtils.close(stmt,conn,rs);
////        }
////        return false;
////    }
////
//
//        boolean flag = new JDBCLoginDemo().login(userName,passWord);
//        if (flag){
//            System.out.println("登录成功!");
//        }else{
//            System.out.println("登录失败！");
//        }
//
//


//    }

//
//    public boolean login(String userName,String passWord){
//        if (userName  == null || passWord == null){
//            return false;
//        }
        Connection conn = null;
        PreparedStatement  pstmt1 = null;
        PreparedStatement  pstmt2 = null;
//        ResultSet rs1 = null;
//        ResultSet rs2 = null;
        try{
             conn = JDBCUtils.getConnection();
//            String sql="select * from user where userName = ? and passWord= ?";
            String sql1="update account set balance= balance+? where id= ?";
            String sql2="update account set balance= balance+? where id= ?";
            // 先获执行sql 的对象PreparedStatement
           pstmt1 = conn.prepareStatement(sql1);
           pstmt2=conn.prepareStatement(sql2);
            System.out.println(sql1);
            System.out.println(sql2);
            // 给? 赋值
           pstmt1.setInt(1,800000);
           pstmt1.setInt(2,1);
            pstmt2.setInt(1,467890);
            pstmt2.setInt(2,2);
            // 执行查询 不需要传递sql

          int count1 = pstmt1.executeUpdate();
          int count2 = pstmt2.executeUpdate();
            System.out.println("count1"+count1+"count2"+count2);
//            if (rs.next()){
//                return true;
//            }else {
//                return false;
//            }
//            return rs.next();
//
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,conn);
        }

    }
}
