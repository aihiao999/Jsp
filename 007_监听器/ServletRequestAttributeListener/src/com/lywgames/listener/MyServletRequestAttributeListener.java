package com.lywgames.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent hsbe) {
		System.out.println("request属性被添加进来了");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent hsbe) {
		System.out.println("request属性被移除了");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent hsbe) {
		System.out.println("request属性被替换了");
	}

}
