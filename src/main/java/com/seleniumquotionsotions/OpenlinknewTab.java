package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenlinknewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.nopcommerce.com/");
	    String newtab= Keys.chord(Keys.CONTROL,Keys.RETURN);
	     driver.findElement(By.linkText("Register")).sendKeys(newtab);

	}

}
