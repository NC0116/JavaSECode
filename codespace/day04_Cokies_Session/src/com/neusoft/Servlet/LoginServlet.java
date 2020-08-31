package com.neusoft.Servlet;

import com.neusoft.dao.Impl.UserDaoImpl;
import com.neusoft.dao.UserDao;
import com.neusoft.domin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/loginServlet1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.设置request编码
        req.setCharacterEncoding("utf-8");
        //2.获取参数
        String username= req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //封装成对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        //调用dao层的login方法
        UserDao dao = new UserDaoImpl();
        User user = dao.login(loginUser);

        //3.先获取 预先生成验证码
        HttpSession session = req.getSession();
      String checkCode_session = (String) session.getAttribute("checkCode_session");
      //4.删除session验证码
        session.removeAttribute("checkCode_session");
        //5.先判读验证码是否正确
        if (checkCode_session != null && checkCode_session.equalsIgnoreCase(checkCode)){
            //6.判断用户名和密码是否正确
//            username1.equals(username) && password1.equals(password)
            if (user != null){
                //TODO 调用UserDao查询数据库
                //登录成功
                //将用户的信息存储到session里面
                session.setAttribute("user",username);

                //重定向到success.jsp里面
                resp.sendRedirect(req.getContextPath()+"/success.jsp");
            }else{
                //登录失败
                req.setAttribute("login_error","用户名或者密码错误！");
                req.getRequestDispatcher(req.getContextPath()+"/login.jsp").forward(req,resp);
            }
        }else{
            // 验证码不一致
            req.setAttribute("cc_error", "验证码错误！");
            req.getRequestDispatcher(req.getContextPath()+"/login.jsp").forward(req, resp);
        }
    }
}
