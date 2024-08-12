package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners

public class Priority {
	@BeforeTest
	void open() {
		System.out.println("open");
	}

	@Test(timeOut=100000)
	void logintest(){
		System.out.println(10/0);
	}
	@Test(invocationTimeOut =1000)
	void homepagetest(){
	
		System.out.println("homepage test fail ");
	}
	@Test()
	void cliam() {
		System.out.println("claim test pass");
	} 
	@AfterTest
	void close() {
		
		System.out.println("close");
	}
	
}
