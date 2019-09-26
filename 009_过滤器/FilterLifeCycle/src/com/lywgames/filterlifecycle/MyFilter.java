package com.lywgames.filterlifecycle;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义过滤器需要实现Servlet的Filter接口
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("在服务器加载项目的时候创建, 初始化。");
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("进入到过滤器了, 可以进行过滤操作了。");
		// 本过滤器放行, 你可以去下一个过滤器或者Servlet了
		chain.doFilter(req, res);
	}
	@Override
	public void destroy() {
		System.out.println("服务器停止或者移除项目的时候的销毁。");
	}
}
