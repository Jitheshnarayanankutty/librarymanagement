package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.UserData;
import com.library.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userData",new UserData());
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView userLogin(@ModelAttribute("userData") UserData userData, Model model) {
		ModelAndView mv = new ModelAndView("login");
		System.out.println("loginService >>" + loginService);
		System.out.println("user >> " + userData.getUserName());
		return mv;
	}
}
