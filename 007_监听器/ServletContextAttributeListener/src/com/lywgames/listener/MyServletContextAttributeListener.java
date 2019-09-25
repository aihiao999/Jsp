package com.lywgames.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent sae) {
		System.out.println("servletContext属性被添加进来了");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent sae) {
		System.out.println("servletContext属性被移除了");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent sae) {
		System.out.println("servletContext属性被替换了");
	}

}
