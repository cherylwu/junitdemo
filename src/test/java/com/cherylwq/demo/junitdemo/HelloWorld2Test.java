package com.cherylwq.demo.junitdemo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class HelloWorld2Test {

	@DataPoint
	public static String USERNAME_NULL = null;
	@DataPoint
	public static String USERNAME_NONE ="";
	@DataPoint
	public static String USERNAME_WITH_ZENG = "zeng";
	@DataPoint
	public static String USERNAME_WITH_SLASH = "wuqian101";
	@DataPoint
	public static String USERNAME_WITH_ZENGHUI = "zenghui222";

	@Theory
	public void testValidateUser1(String username) {
		HelloWorld2 hwd2 = new HelloWorld2();
		assumeThat(username, containsString("zenghui"));
		assertEquals(1, hwd2.validateUser(username));
	}

	@Theory
	public void testValidateUser2(String username) {
		HelloWorld2 hwd2 = new HelloWorld2();
		//assumeThat(username, CombinableMatcher.<String> either(is("")).or(null));
		Assume.assumeTrue(username==null || "".equals(username));
		assertEquals(-1,hwd2.validateUser(username));
		System.out.println(username);
	}

	@Theory
	public void testValidateUser3(String username){
		HelloWorld2 hwd2 = new HelloWorld2();
		Assume.assumeNotNull(username);
		Assume.assumeTrue(!"".equals(username) && username.indexOf("zenghui")<0 && username.indexOf("wuqian")<0);
		assertEquals(3,hwd2.validateUser(username));
	}
}
