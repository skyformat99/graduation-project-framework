package com.freud.framework.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		if (session == null) {
			session = this.sessionFactory.openSession();
		}
		return session;
	}

	public void beginTransaction() {
		this.session.beginTransaction();
	}

	public void commit() {
		this.session.getTransaction().commit();
	}

	public void rollback() {
		this.session.getTransaction().rollback();
	}
}
