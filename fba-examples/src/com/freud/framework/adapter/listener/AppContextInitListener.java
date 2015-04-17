package com.freud.framework.adapter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

public class AppContextInitListener implements ServletContextListener,
		HttpSessionListener {

	private static final Logger LOGGER = Logger
			.getLogger(AppContextInitListener.class);

	public AppContextInitListener() {
		LOGGER.info(AppContextInitListener.class.getName() + " instanced.");
	}

	public void contextDestroyed(ServletContextEvent event) {
		LOGGER.info(AppContextInitListener.class.getName() + " destroyed.");
	}

	public void contextInitialized(ServletContextEvent event) {
		LOGGER.info(AppContextInitListener.class.getName() + " initialized.");
	}

	public void sessionCreated(HttpSessionEvent event) {
		LOGGER.info(AppContextInitListener.class.getName()
				+ " Session created.");
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		LOGGER.info(AppContextInitListener.class.getName()
				+ " Session destroyed.");
		HttpSession session = event.getSession();
		session.invalidate();
	}

}
