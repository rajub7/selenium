package com.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class KeywordsAnnotations {
	@BeforeMethod(alwaysRun=true)
	void appopen(){
		System.out.println("application open");
	}
	 
	@Test()
	@Parameters({"uid","pwd"})
	void logintest(String uid,String pwd){
		Assert.assertEquals("raju", "raju");
		System.out.println("login test pass");
	}
	@Test(enabled=false,timeOut=1000)
	void homepagetest(){
		Assert.assertTrue(false);
		System.out.println("homepage test pass");
	}
	@Test
	void dealstest(){
		Assert.assertFalse(false);
		throw new SkipException("throw exception");
	}
	@Test(invocationCount=10)
	void claimtest(){
		Assert.assertNotEquals("raju", "rani");
		throw new SkipException("throw exception");
	}
	@AfterMethod
	void closeapp(){
		System.out.println("application close");
	}
}
