package com.seleniumquotionsotions;

import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScrennshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	/*	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(src, file);*/
		
		WebElement ele=driver.findElement(By.xpath("(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials'])[1]"));
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ele.getScreenshotAs(OutputType.FILE);
		File file=new File(".\\screenshots\\elementpage.jpg");
		FileUtils.copyFile(src, file);
		driver.close();
	}

}
