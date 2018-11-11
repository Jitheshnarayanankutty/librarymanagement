package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/login")
	public String userLogin(@RequestParam String userName, @RequestParam String password, ModelMap model) {
		if (!loginService.isValidUser(userName, password)) {
			model.put("errorMessage", "Invalid credentials");
			return "login";
		}	
		model.put("userName", userName);
		return "welcome";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";
	}	
}
