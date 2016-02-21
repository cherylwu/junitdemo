package com.cherylwq.demo.junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testAssertArrayEquals(){
		String[] aArray = {"a","b","c","d"};
		String[] bArray = {"a","b","c","d"};
		assertArrayEquals("failure - byte arrays not same",aArray,bArray);
	}
	
	@Test 
	public void testAssertArrayEquals2(){
		String[] x = null ;
		String[] y = null;
		assertArrayEquals("failure - byte arrays not same",x,y);
	}
	
	@Test 
	public void testAssertEquals(){
		if ("xyx" == new String("xyx")) {			
			System.out.println("======");
		} else {
			System.out.println("!=");
		}
		assertEquals("failure - they are not same", "xyz",new String("xyz"));
	}
	
 	@Test
	public void testAssertFalse(){
 		assertFalse("false: it's true",false);
 	}
 	
 	@Test
 	public void testAssertTrue(){
 		assertTrue("false: it's false", true);
 	}
 	
 	@Test
 	public void testAssertNotNull(){
 		if("".equals(null)){
 			System.out.println("equal");
 		}else{
 			System.out.println("not equal");
 		}
 		assertNotNull("false: it's null", new Object());
 	}
 	
 	@Test
 	public void testAssertNotSame(){
 		assertNotSame("failure: a is the same with b", new Object(),new Object());
 	}
 	
 	@Test
 	public void testAssertNull(){
 		
 	}
 	
}
