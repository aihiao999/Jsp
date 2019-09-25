package com.lywgames.listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class HttpSessionActivationListenerBean implements HttpSessionActivationListener, Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent hse) {
		System.out.println("session中的值被活化了...");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent hse) {
		System.out.println("session中的值被钝化了...");
	}

}
