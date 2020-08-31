package com.neusoft.Servlet;

import com.neusoft.dao.Impl.UserDaoImpl;
import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username= req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");

        User rgtUser = new User();
        rgtUser.setUsername(username);
        rgtUser.setPassword(password);
        rgtUser.setGender(gender);

        UserDao dao = new UserDaoImpl();
       int count = dao.register(rgtUser);
       if (count>0){
           System.out.println("注册成功！");
       }else {
           System.out.println("注册失败！");
       }
    }
}
