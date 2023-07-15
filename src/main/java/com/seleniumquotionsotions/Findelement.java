package com.seleniumquotionsotions;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
       List<WebElement> str=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("show :"+str.size());
        String ele="Release notes";
        for (WebElement webElement : str) {
        	//System.out.println(webElement.getText());
        	 
        	if(ele.equals(webElement.getText())){
        		System.out.println("release notes : element found");
        		webElement.click();
        	
        	}
        	}
		 	driver.close();
		}
	}


