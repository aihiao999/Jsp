package com.lywgames.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		System.out.println("Session属性被添加进来了");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		System.out.println("Session属性被移除了");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent hsbe) {
		System.out.println("Session属性被替换了");
	}

}
