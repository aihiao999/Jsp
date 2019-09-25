package com.lywgames.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {
	/**
	 * 有客户端访问服务器资源的时候调用
	 */
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("有request请求");
	}

	/**
	 * 服务器对客户端做出响应的时候调用
	 */
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("有request销毁了");
	}

}
