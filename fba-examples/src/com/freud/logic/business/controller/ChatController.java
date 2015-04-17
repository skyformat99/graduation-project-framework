package com.freud.logic.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/chat")
@Controller("chatController")
public class ChatController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String notifyUpdate() {
		return "chat.index";
	}

}
