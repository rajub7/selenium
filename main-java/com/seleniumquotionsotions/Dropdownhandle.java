package com.seleniumquotionsotions;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
       WebElement ele=driver.findElement(By.xpath("(//select)[1]"));
       Select slt=new Select(ele);
       slt.selectByIndex(16);
       slt.selectByValue("AUT");
       slt.selectByVisibleText("Burundi");
       List<WebElement> li=slt.getOptions();
       for (WebElement webelt : li) {
		if(webelt.getText().equals("Brazil")){
			webelt.click();
			break;
		}
	}
       driver.close();
	}

}
