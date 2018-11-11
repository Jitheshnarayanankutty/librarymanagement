package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.LoginDAO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;

	@Transactional
	public boolean isValidUser(String userName, String password) {

		loginDAO.isValidUser(userName, password);
		if (userName.equals("abc"))
			return true;
		return false;
	}
}
