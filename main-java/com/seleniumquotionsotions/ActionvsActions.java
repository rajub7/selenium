package com.seleniumquotionsotions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Action;

public class ActionvsActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));

		Actions act=new Actions(driver);
		
	
		 Action action=act.moveToElement(ele).build();
		action.perform();
       act.moveToElement(ele1).click().perform();
      
	}

}
