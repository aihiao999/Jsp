package com.lywgames.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.lywgames.bean.UserBean;
import com.lywgames.dao.UserDao;
import com.lywgames.dao.impl.UserDaoImpl;

public class AutoLoginFilter implements Filter {
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

	public Cookie containCookie(Cookie[] cookies) {
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("autologin")) {
					return cookie;
				}
			}
		}
		
		return null;
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		System.out.println(request.getServletPath());
		
		// 如果客户端是登录请求或者请求login.jsp, 直接放行
		String servletPath = request.getServletPath();
		// Session里有用户信息, 放行
		UserBean userBean = (UserBean)request.getSession().getAttribute("userBean");
		if(userBean != null) {
			chain.doFilter(req, res);
			return;
		}else {
			// 如果Session里没有用户信息, 查看Cookie
			Cookie[] cookies = request.getCookies();
			Cookie cookie = containCookie(cookies);
			if(cookie != null) {
				String[] ups = cookie.getValue().split("&");
				if(ups.length >= 2 && ups[0] != null && ups[0].length() > 0 && ups[1] != null && ups[1].length() > 0) {
					userBean = new UserBean();
					userBean.setUsername(ups[0]);
					userBean.setPassword(ups[1]);
					UserDao dao = new UserDaoImpl();
					UserBean bean = dao.login(userBean);
					if(bean != null) {
						request.getSession().setAttribute("userBean", userBean);
						chain.doFilter(req, res);
						return;
					}
				}
			}
			
			if(servletPath.equals("/LoginServlet.action")) {
				chain.doFilter(req, res);
				return;
			}
		}
			
		request.getRequestDispatcher("login.jsp").forward(req, res);
	}
	
	@Override
	public void destroy() {
		
	}

}
