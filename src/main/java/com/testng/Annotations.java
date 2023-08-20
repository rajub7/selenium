package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	void laoreuchsetup(){
		System.out.println("BeforeSuite--------setup procces");
	}
	@BeforeTest
	void openurl(){
		System.out.println("BeforeTest----------passing the url");
	}
	@BeforeClass
	void browserlaunch(){
		System.out.println("BeforeClass----------launching browser");
	}
	@BeforeMethod
	void appopen(){
		System.out.println("BeforeMethod------------application open");
	}
	@Test(priority = 1,groups = "sanity")
	void logintest(){
		System.out.println("sanity test group");
		System.out.println("login test pass");
	}
	@Test(priority=2,groups ="regression")
	void homepagetest(){
		System.out.println("sanity test group");
		System.out.println("homepage test pass");
	}
	@AfterMethod
	void closeapp(){
		System.out.println("AfterMethod-------------application close");
	}
	@AfterClass
	void browserclose(){
		System.out.println("AfterClass---------------clossing browser");
	}
	@AfterTest
	void urlclose(){
		System.out.println("AfterTest--------------------clossing url");
	}
	@AfterSuite
	void closestop(){
		System.out.println("AfterSuite-----------------------stopping proccing");
	}

}
