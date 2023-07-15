package com.seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlliderHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Thread.sleep(4000);
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println(min_slider.getLocation());
		System.out.println(min_slider.getSize());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 40).perform();
		System.out.println(min_slider.getLocation());
		System.out.println(min_slider.getSize());
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println(max_slider.getLocation());
		System.out.println(max_slider.getSize());
		
		act.dragAndDropBy(max_slider, -100, -50).perform();
		System.out.println(max_slider.getLocation());
		System.out.println(max_slider.getSize());
		

		
	}

}
