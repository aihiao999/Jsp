package com.lywgames.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		System.out.println("创建了session");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("销毁了session");
	}

}
