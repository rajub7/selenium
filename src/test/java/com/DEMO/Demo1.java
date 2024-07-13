package com.DEMO;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	
	@Test(priority = 4,dependsOnMethods = "m1",groups = "regression")
	public void m4() {
		System.out.println("m4() excute");
	}
	
	@Test(priority = 5,dependsOnMethods = "m1",groups ="regression")
	public void m5() {
		System.out.println("m5() excute");
	}
	@Test(priority = 6,groups = "regressions")
	public void m6() {
		System.out.println("m6() excute");
	}
	
   	


}
