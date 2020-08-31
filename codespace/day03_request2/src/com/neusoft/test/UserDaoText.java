package com.neusoft.test;

import com.neusoft.dao.UserDaoImpl;
import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoText {
    @Test
   public void  test() throws SQLException {
        User loginUser = new User();
        loginUser.setUsername("zhangsan");
        loginUser.setPassword("1234");

        UserDao dao = new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
