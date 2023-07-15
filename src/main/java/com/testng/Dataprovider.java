package com.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider {

	@BeforeMethod(alwaysRun=true)
	void appopen(){
		System.out.println("application open");
	}
	 
	
	@DataProvider(name="logindata")
	Object[][] getdata(){
		return new Object[][]{
		{"uid "," pwd"},{"uid1","pwd2 "},{"uid3","pwd3"}	
		};	
	}
	@DataProvider(name="homedata")
	Object[][]setdata(){
		Object[][] data=new Object[2][2];
	    data[0][0]="RAJU";
	    data[0][1]="RANI";
	    data[1][0]="CHERRY";
	    data[1][1]="TONY";
       return data;
	}
	
	@Test(dataProvider="logindata")
	void logintest(String uid,String pwd){
		System.out.println("login test pass");
	}
	@Test(dataProvider="homedata")
	void homepagetest(String uid,String pwd){
		System.out.println(uid+" "+pwd);
		System.out.println("login test pass");
	}
	
	
	
	
}
