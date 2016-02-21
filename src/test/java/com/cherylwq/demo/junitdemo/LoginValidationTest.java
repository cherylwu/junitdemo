package com.cherylwq.demo.junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidationTest {
	

	@Test
	public void testUserValidation1() {
		//LoginValidation lv = new LoginValidation();
		String username = "wuqian";
		String password = "19900731wq";
		Boolean flag = LoginValidation.userValidation(username, password);
		assertTrue("false:login invalidation",flag);
	}
	
	@Test
	public void testUserValidation2() {
		//LoginValidation lv = new LoginValidation();
		String username = "wuqian";
		String password = "19900610wq";
		Boolean flag = LoginValidation.userValidation(username, password);
		assertFalse("false:login invalidation",flag);
	}
	
	@Test
	public void testUserValidation3() {
		//LoginValidation lv = new LoginValidation();
		String username = "";
		String password = "19900610wq";
		Boolean flag = LoginValidation.userValidation(username, password);
		assertFalse("false:login invalidation",flag);
	}
	
	@Test
	public void testUserValidation4() {
		//LoginValidation lv = new LoginValidation();
		String username = null;
		String password = "19900610wq";
		Boolean flag = LoginValidation.userValidation(username, password);
		assertFalse("false:login invalidation",flag);
	}

}
