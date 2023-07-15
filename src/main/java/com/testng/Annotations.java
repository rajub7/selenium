package com.testng;

import org.asynchttpclient.util.HttpConstants.Methods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class Annotations {

	@BeforeSuite
	void lauchsetup(){
		System.out.println("B.SUITE--setup procces");
	}
	@BeforeTest
	void openurl(){
		System.out.println("B.TEST--passing the url");
	}
	@BeforeClass
	void browserlaunch(){
		System.out.println("B.CLASS--launching browser");
	}
	@BeforeMethod
	void appopen(){
		System.out.println("B.METHOD--application open");
	}
	@Test(groups="sanity")
	void logintest(){
		System.out.println("sanity test group");
		System.out.println("login test pass");
	}
	@Test(priority=1,dependsOnMethods="logintest",groups="sanity")
	void homepagetest(){
		System.out.println("sanity test group");
		System.out.println("homepage test pass");
	}
	@AfterMethod
	void closeapp(){
		System.out.println("A.METHOD--application close");
	}
	@AfterClass
	void browserclose(){
		System.out.println("A.CLASS---clossing browser");
	}
	@AfterTest
	void urlclose(){
		System.out.println("A.TEST--clossing url");
	}
	@AfterSuite
	void closestop(){
		System.out.println("A.SUITE--stopping proccing");
	}

}
