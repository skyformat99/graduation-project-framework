package com.freud.logic.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.freud.logic.business.service.TouPiaoService;

@RequestMapping("/toupiao")
@Controller("toupiaoController")
public class TouPiaoController {

	@Autowired
	private TouPiaoService touPiaoService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView toupiaoList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("toupiao.list");
		mav.addObject("toupiaos", touPiaoService.getAllTouPiao());
		return mav;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String toupiaoUpdate(int id) {
		touPiaoService.updateTouPiao(id);
		return "redirect:/toupiao/list";
	}

}
