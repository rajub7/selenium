package com.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class KeywordsAnnotations  {
	
	@Parameters({"uid","pwd"}) 
	@Test(priority = 5)
	void logintest(String uid,String pwd){
		System.out.println(uid+" "+pwd);
		System.out.println("login test pass ");
	}
	@Test(enabled=false)
	void homepagetest(){
		Assert.assertTrue(false);
		System.out.println("homepage test fail ");
	}
	@Test(priority = 6)
	void dealstest(){
		Assert.assertFalse(false);
		throw new SkipException("throw exception ");
	}
	@Test(priority = 7)
	void claimtest(){
		Assert.assertNotEquals("raju", "rani");
		System.out.println("claimtest pass ");
	}
	
}
