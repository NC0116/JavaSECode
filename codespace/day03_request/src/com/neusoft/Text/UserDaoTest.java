package com.neusoft.Text;

import com.neusoft.dao.UserDaoImpl;
import com.neusoft.domin.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoTest {
   @Test
    public void test() throws SQLException {
        User loginUser = new User();
        loginUser.setUsername("zhangsan");
        loginUser.setPassword("1234");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(loginUser);
       String username = user.getUsername();
       user.getPassword();
       System.out.println(user);
    }
}
