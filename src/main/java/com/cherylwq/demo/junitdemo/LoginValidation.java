package com.cherylwq.demo.junitdemo;

public class LoginValidation {

	public static void main(String[] args) {
		String username = "1";
		String password = "1";
		Boolean flag = userValidation(username,password);
		System.out.println(flag);
		
	}

	public static Boolean userValidation(String username, String password) {
		if("wuqian".equals(username) && "19900731wq".equals(password)){
			return true;
		}else{
			return false;
		}
	}
}
