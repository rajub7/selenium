package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Dataprovider extends Annotations {

	@DataProvider(name="homedata")
	Object[][]setdata(){
		Object[][] data=new Object[2][2];
	    data[0][0]="RAJU";
	    data[0][1]="RANI";
	    data[1][0]="CHERRY";
	    data[1][1]="TONY";
       return data;
	}
	
	@Test(priority = 3,dataProvider="homedata")
	void logintest(String uid,String pwd){
		System.out.println(uid+" "+pwd);
		System.out.println("login test pass ");
	}
	@Test(priority = 4,  dataProvider="homedata")
	void homepagetest(String uid,String pwd){
		System.out.println(uid+" "+pwd);
		System.out.println("homepage test pass ");
	}
	
		
	
	
}
