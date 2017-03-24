package com.training.session.controller;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionCounterListener implements HttpSessionListener {
	
	public static int totalActiveSession;

	@Override
	public void sessionCreated(HttpSessionEvent paramHttpSessionEvent) {
		totalActiveSession++;
		System.out.println("sessionCreated - add one session into counter");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent paramHttpSessionEvent) {
		totalActiveSession--;
		System.out.println("sessionDestroyed - deduct one session from counter");
	}

}
