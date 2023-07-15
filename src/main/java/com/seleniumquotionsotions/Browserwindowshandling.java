package com.seleniumquotionsotions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserwindowshandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String parentwin=driver.getWindowHandle();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windows =driver.getWindowHandles();
		for(String str:windows){
		String text=driver.switchTo().window(str).getTitle();
		System.out.println(text);
		if(!parentwin.equals(str)){
			driver.close();
		}
		}
		
		
		/* Iterator<String> it=windows.iterator();
		   String parent=it.next();
		   String child=it.next();
		   System.out.println(parent+"  ;"+child);
		   driver.switchTo().window(child);
		   driver.close(); */
	
	}
	
}
