package com.library.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Login;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public boolean isValidUser(String userName, String password) {
		Login loginData = null;
		try {
			Session session = this.sessionFactory.getCurrentSession();
			loginData = (Login) session.load(Login.class, userName);
		} catch(Exception e ) {
			System.out.println("ERROR ->" + e);
		}
		return loginData != null ? true : false;
	}
}
