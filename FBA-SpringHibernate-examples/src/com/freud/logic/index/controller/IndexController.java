package com.freud.logic.index.controller;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.freud.framework.bean.BaseService;
import com.freud.logic.index.beans.User;

@Controller("IndexController")
public class IndexController extends BaseService {

	@RequestMapping({ "", "/", "/index" })
	public ModelAndView index() {
		System.out.println("index");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		User user = (User) super.getSession().createCriteria(User.class)
				.add(Restrictions.eq("username", "admin")).list().get(0);

		mav.addObject("username", user.getUsername());
		return mav;
	}
}
