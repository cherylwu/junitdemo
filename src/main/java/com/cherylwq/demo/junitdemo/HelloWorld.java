package com.cherylwq.demo.junitdemo;

public class HelloWorld {

	public static void main(String[] args){
		System.out.println("hello world");
	}
	
	public int calculate(int a, int b){
		return a+b;
	}
	
	public int lengthArray(String[] myArray){
		
		int x = myArray.length;
		return x;
	}
	
	public void timeOut(){
		while(true){
			
		}
	}
}
