package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inneriframehandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("switch in iframe");
	     driver.switchTo().defaultContent();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
	     
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']")));
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("successfull switched inside");
	     driver.close();
	}

}
