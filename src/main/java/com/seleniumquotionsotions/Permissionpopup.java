package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permissionpopup {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		opt.addArguments("--remote-allow-origins=*");
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		     WebDriver driver=new ChromeDriver(opt);
		     driver.get("https://www.redbus.com");
		     driver.close();
	}

}
