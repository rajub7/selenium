package com.seleniumquotionsotions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//  JavaS.drawborderjs(driver, logo);
	 // String title=JavaScriptutils.gettitlejs(driver);
		  System.out.println(logo);
	}

}
