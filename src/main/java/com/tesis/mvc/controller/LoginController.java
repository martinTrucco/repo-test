package com.tesis.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/inicio")
	public ModelAndView showMessage() {
		System.out.println("in login-controller");
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
}
