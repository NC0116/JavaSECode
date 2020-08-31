package com.neusoft.dao;

import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;
import com.neusoft.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    User user=null;
    @Override
    public User login(User loginUser) {
        try{
            conn= JDBCUtils.getConnection();
            String sql="select * from userlogin where username=? and password=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,loginUser.getUsername());
            pstmt.setString(2,loginUser.getPassword());
            rs = pstmt.executeQuery();
            while (rs.next()){
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn,rs);
        }
        return user ;
    }
}
