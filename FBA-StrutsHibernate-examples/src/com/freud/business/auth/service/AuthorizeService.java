package com.freud.business.auth.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freud.business.auth.bean.User;

@Service("authorizeService")
public class AuthorizeService {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public User getUser(String username) {

		Criteria criteria = sessionFactory.openSession().createCriteria(
				User.class);

		criteria.add(Restrictions.eq("username", username));

		List<User> users = criteria.list();

		if (users == null || users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}

	public void saveUser(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
