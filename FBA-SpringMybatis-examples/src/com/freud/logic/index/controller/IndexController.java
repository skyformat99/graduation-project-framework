package com.freud.logic.index.controller;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.freud.framework.base.controller.BaseController;
import com.freud.logic.business.service.CommonMessageService;
import com.freud.logic.business.service.XinWenService;

@Controller("IndexController")
public class IndexController extends BaseController {

	@Autowired
	private CommonMessageService commonMessageService;

	@Autowired
	private XinWenService xinWenService;

	@RequestMapping({ "", "/", "/index" })
	public ModelAndView index() {
		System.out.println("index");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("message", commonMessageService.getCommonMessage());

		mav.addObject("xinwens",
				xinWenService.getAllXinWen(new RowBounds(0, 10)));
		return mav;
	}
}
