package com.freud.logic.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.freud.logic.business.bean.CommonMessage;
import com.freud.logic.business.bean.XinWen;
import com.freud.logic.business.service.CommonMessageService;
import com.freud.logic.business.service.TouPiaoService;
import com.freud.logic.business.service.XinWenService;

@RequestMapping("/manage")
@Controller("manageController")
public class ManageController {

	@Autowired
	private CommonMessageService commonMessageService;

	@Autowired
	private XinWenService xinWenService;

	@Autowired
	private TouPiaoService touPiaoService;

	@RequestMapping(value = "/notify/update", method = RequestMethod.GET)
	public String notifyUpdate() {
		return "manage.notify.update";
	}

	@RequestMapping(value = "/notify/update", method = RequestMethod.POST)
	public String notifyUpdatePOST(String notify) {
		CommonMessage commonMessage = new CommonMessage();
		commonMessage.setNotify(notify);
		commonMessageService.insert(commonMessage);
		return "redirect:/index";
	}

	@RequestMapping(value = "/xinwen/add", method = RequestMethod.GET)
	public String xinwenAdd() {
		return "manage.xinwen.add";
	}

	@RequestMapping(value = "/xinwen/add", method = RequestMethod.POST)
	public String addPOST(XinWen xinwen) {
		xinWenService.insertXinWen(xinwen);
		return "redirect:/index";
	}

	@RequestMapping(value = "/toupiao/list", method = RequestMethod.GET)
	public ModelAndView toupiaoList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("manage.toupiao.list");
		mav.addObject("toupiaos", touPiaoService.getAllTouPiao());
		return mav;
	}

	@RequestMapping(value = "/toupiao/add", method = RequestMethod.GET)
	public String toupiaoAdd() {
		return "manage.toupiao.add";
	}

	@RequestMapping(value = "/toupiao/add", method = RequestMethod.POST)
	public String toupiaoAddPOST(String username) {
		touPiaoService.insertTouPiao(username);
		return "redirect:/manage/toupiao/list";
	}

	@RequestMapping(value = "/toupiao/del", method = RequestMethod.GET)
	public String toupiaoDEL(int id) {
		touPiaoService.delete(id);
		return "redirect:/manage/toupiao/list";
	}
}
