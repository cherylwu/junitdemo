package com.cherylwq.demo.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloWorldTest {

	@Rule
    public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per method tested
	
	
	@Test(expected = NullPointerException.class)
	public void testLengthArray(){
		HelloWorld hwd = new HelloWorld();
		hwd.lengthArray(null);
	}
	
	//@Ignore
	@Test
	public void testCalculate() {
		HelloWorld hw = new HelloWorld();
		int k = hw.calculate(5, 6);
		assertEquals(11,k);
	}
	
	
	@Test
	public void testTimeOut(){
		HelloWorld hwd = new HelloWorld();
		hwd.timeOut();
	}
	
	
	
	

}
