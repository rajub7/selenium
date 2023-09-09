package com.seleniumquotionsotions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocompletedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver(opt);
     driver.get("https://www.twoplugs.com");
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
    WebElement searchbox= driver.findElement(By.xpath("//input[@id='autocomplete']"));
    searchbox.clear();
    searchbox.sendKeys("india");
    String text;
    
    do {
    	searchbox.sendKeys(Keys.ARROW_DOWN);
    	text=searchbox.getAttribute("value");
    	if(text.equals("Indianapolis, IN, USA")){
    		searchbox.sendKeys(Keys.ENTER);
    		break;
    	}
		
	} while (!text.isEmpty());
    
    driver.close();
    
    
	}

}
