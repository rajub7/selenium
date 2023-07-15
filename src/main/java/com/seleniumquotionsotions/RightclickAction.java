package com.seleniumquotionsotions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//a[normalize-space()='Demo']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    Actions act=new Actions(driver);
	    act.contextClick(ele).build().perform();
	    driver.findElement(By.xpath("(//ul[@class='context-menu-list context-menu-root']/li)[7]")).click();
	    driver.switchTo().alert().accept();
	    driver.close();
	}
}