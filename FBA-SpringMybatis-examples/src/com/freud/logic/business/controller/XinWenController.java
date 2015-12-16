package com.freud.logic.business.controller;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.freud.logic.business.service.XinWenService;

@RequestMapping("/xinwen")
@Controller("xinWenController")
public class XinWenController {

	@Autowired
	private XinWenService xinWenService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView xinwenList(Integer index) {

		if (index == null) {
			index = 0;
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("xinwen.list");
		mav.addObject("xinwens",
				xinWenService.getAllXinWen(new RowBounds((index - 1) * 10, 10)));
		int allSize = xinWenService.getAllXinWen(new RowBounds()).size();

		int count = allSize / 10;

		if (allSize % 10 != 0) {
			count++;
		}

		mav.addObject("index", index == 0 ? 1 : index);
		mav.addObject("count", count);

		return mav;
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView show(int id) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("xinwen.show");
		mav.addObject("xinwen", xinWenService.getXinWenById(id));
		
		return mav;
	}
}
