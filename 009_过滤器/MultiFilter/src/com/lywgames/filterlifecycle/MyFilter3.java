package com.lywgames.filterlifecycle;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter3 implements Filter {
	@Override
	public void init(FilterConfig config) throws ServletException {}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		System.out.println("请求进入到过滤器3");
		chain.doFilter(req, res);
		System.out.println("请求经过Servlet处理后, 返回到过滤器3");
	}
	@Override
	public void destroy() {}
}
