package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authanticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(opt);
	     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
