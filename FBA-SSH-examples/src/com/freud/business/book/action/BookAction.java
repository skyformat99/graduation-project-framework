package com.freud.business.book.action;

import com.freud.business.book.bean.Person;
import com.freud.business.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Acts as a controller to handle actions related to editing a Person.
 * 
 * @author bruce phillips
 *
 */
public class BookAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private BookService editService;

	private Person personBean;

	public String list() throws Exception {

		editService.savePerson(getPersonBean());

		return SUCCESS;

	}

	public String detail() throws Exception {

		setPersonBean(editService.getPerson());

		return INPUT;
	}

	public String add() throws Exception {

		setPersonBean(editService.getPerson());

		return INPUT;
	}

	public String update() throws Exception {

		setPersonBean(editService.getPerson());

		return INPUT;
	}

	public String delete() throws Exception {

		setPersonBean(editService.getPerson());

		return INPUT;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

}
