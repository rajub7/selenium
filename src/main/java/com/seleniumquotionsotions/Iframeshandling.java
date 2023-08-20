package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframeshandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	     Thread.sleep(4000);
	     driver.switchTo().frame("packageFrame");
	     driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]")).click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("classFrame");
	     WebElement ele=driver.findElement(By.xpath("//h3[contains(text(),'Constructor Summary')]"));
	     Boolean b=ele.isDisplayed();
	     System.out.println("abractmethod display :" +b);
	     
	}

}
