package com.neusoft.WebServlet;

import com.neusoft.domin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/successServlet")
public class successServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 给页面一句话
        User user = (User) req.getAttribute("user");
        if (user != null){
            // 设置编码
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("登录成功!,"+ user.getUsername() + " , 欢迎您 ");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
