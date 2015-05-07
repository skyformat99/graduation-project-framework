package com.freud.logic.business.controller;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.freud.logic.business.bean.Huifu;
import com.freud.logic.business.bean.TieZi;
import com.freud.logic.business.service.TieZiService;

@RequestMapping("/tiezi")
@Controller("tieZiController")
public class TieZiController {

	@Autowired
	private TieZiService tieZiService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView tieZiList(Integer index) {

		if (index == null) {
			index = 0;
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("tiezi.list");
		mav.addObject("tiezis",
				tieZiService.getTiezis(new RowBounds((index - 1) * 10, 10)));

		int allSize = tieZiService.getTiezis(new RowBounds()).size();

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

		mav.setViewName("tiezi.show");
		mav.addObject("tiezi", tieZiService.getTieziById(id));

		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGET() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("tiezi.add");
		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPOST(TieZi tiezi) {
		tieZiService.insertTieZi(tiezi);
		return "redirect:/tiezi/list";
	}

	@RequestMapping(value = "/huifu/add", method = RequestMethod.POST)
	public ModelAndView addPOST(Huifu huifu) {

		tieZiService.insertHuiFu(huifu);

		ModelAndView mav = new ModelAndView();

		mav.setViewName("tiezi.show");
		mav.addObject("tiezi", tieZiService.getTieziById(huifu.getTieziId()));

		return mav;
	}
}
