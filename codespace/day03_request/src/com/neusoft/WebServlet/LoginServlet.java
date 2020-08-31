package com.neusoft.WebServlet;

import com.neusoft.dao.UserDaoImpl;
import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3.封装成对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        //4.调用dao中的login方法

        User user=null;
        UserDao dao= new UserDaoImpl();
        user = dao.login(loginUser);

        //5.判断
        if (user ==null){
            System.out.println("登录失败！");
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else {
            System.out.println("登录成功！");
            req.setAttribute("user",user);
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}