package com.freud.business.book.service;

import java.util.List;

import com.freud.business.book.bean.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implement Services needed to edit and save a Person object's state. In this
 * implementation the Person object's state is stored in memory
 * 
 * @author brucephillips
 *
 */
@Service("editService")
public class BookService {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public Person getPerson() {
		List<Person> persons = sessionFactory.openSession()
				.createQuery("from Person").list();
		if (persons == null || persons.isEmpty()) {
			return null;
		}
		return persons.get(0);
	}

	public void savePerson(Person personBean) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personBean);
		session.getTransaction().commit();

	}
}
