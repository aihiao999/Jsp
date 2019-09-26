package com.lywgames.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lywgames.bean.UserBean;
import com.lywgames.dao.UserDao;
import com.lywgames.dao.impl.UserDaoImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean autologin = false;
		if(req.getParameter("autologin") != null) {
			autologin = "1".equals(req.getParameter("autologin"));
		}
		UserBean userBeanSession = (UserBean)req.getSession().getAttribute("userBean");
		if(userBeanSession != null) {
			username = userBeanSession.getUsername();
			password = userBeanSession.getPassword();
		}
		if(username != null && username.length() > 0 && password != null && password.length() > 0) {
			UserBean bean = new UserBean();
			bean.setUsername(username);
			bean.setPassword(password);
			
			// 验证用户
			UserDao dao = new UserDaoImpl();
			UserBean userBean = dao.login(bean);
			if(userBean != null) {
				// 自动登录创建Cookie
				if(autologin) {
					Cookie cookie = new Cookie("autologin", username+"&"+password);
					cookie.setMaxAge(60 * 60 * 24 * 7); // 7天有效期
					cookie.setPath("AutoLogin");
					resp.addCookie(cookie);
				}
				req.getSession().setAttribute("userBean", userBean);
				resp.sendRedirect("index.jsp");
				return;
			}
		}
		
		req.setAttribute("loginError", "登录失败, 请重试。");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
