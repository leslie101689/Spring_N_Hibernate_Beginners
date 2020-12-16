package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
		return true;
	}
}
