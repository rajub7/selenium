package com.DEMO;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testng.Priority;

public class Demo {

	
	@BeforeMethod
	public void setup() {
		
		System.out.println("open browser");
	}
	
	@DataProvider(name = "data")
	public Object[][] dataprovide() {
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="raju";
		obj[0][1]="ram";
		obj[1][0]="raj";
		obj[1][1]="ramu";
		return obj;
	}
	
	
	
	@Test(priority = 1,groups = "sanity",expectedExceptions = AssertionError.class)
	public void m1() {
		System.out.println("m1() excute");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 2, dependsOnMethods = "m1",groups = "sanity",alwaysRun = true)
	public void m2() {
		System.out.println("m2() excute");
	}
	@Test(priority = 3,dependsOnMethods =  "m2",groups = "sanity")
	public void m3() {
		System.out.println("m3() excute");
	}
	
	@Test(dataProvider = "data")
	public void test(String uid, String pwd) {
		System.out.println(uid+"  "+pwd);
		
	}
	
	@AfterMethod
   public void close() {
		
	   System.out.println("browser close");
		
	}	
}
