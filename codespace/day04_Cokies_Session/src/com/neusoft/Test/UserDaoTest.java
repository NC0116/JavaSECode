package com.neusoft.Test;

import com.neusoft.dao.Impl.UserDaoImpl;
import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;
import org.junit.Test;

public class UserDaoTest {
 @Test
 public void test() {

//  User loginUser = new User();
//  loginUser.setUsername("zhangsan");
//  loginUser.setPassword("1234");
//
//  UserDao dao = new UserDaoImpl();
//  User user = dao.login(loginUser);
//  System.out.println(user);

  User rgtUser = new User();
  rgtUser.setUsername("王五");
  rgtUser.setPassword("1234");
  rgtUser.setGender("男");

  UserDao dao = new UserDaoImpl();
  int count= dao.register(rgtUser);
  System.out.println(count);
 }
}
