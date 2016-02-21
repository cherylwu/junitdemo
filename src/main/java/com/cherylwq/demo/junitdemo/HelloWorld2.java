package com.cherylwq.demo.junitdemo;

public class HelloWorld2 {
	public int validateUser(String username) {
		if (null == username || "".equals(username)) {
			return -1;
		} else if (username.indexOf("zenghui")>-1) {
			return 1;
		} else if (username.indexOf("wuqian")>-1) {
			return 2;
		} else {
			return 3;
		}
	}
	
//	public static void main(String[] args){
//		HelloWorld2 hwd = new HelloWorld2();
//		System.out.println(hwd.validateUser(null));
//	}
	
}
