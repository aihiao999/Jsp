package com.lywgames.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
	/**
	 * 项目被服务器(Tomcat服务器)加载的时候调用
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("servletcontext创建");
	}

	/**
	 * 项目被服务器(Tomcat服务器)移除的时候调用
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("servletcontext销毁");
	}

}
