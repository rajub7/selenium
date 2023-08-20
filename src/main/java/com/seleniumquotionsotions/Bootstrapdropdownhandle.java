package com.seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Bootstrapdropdownhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='Dropdown Example'])[1]")).click();
		List<WebElement>li=driver.findElements(By.xpath("//div[@class='dropdown open']//ul[@role='menu']/li"));
		selectbootstrap(li, "html");
		driver.close();
	}
	
	public static void selectbootstrap(List<WebElement>opt,String value){
		for (WebElement Element : opt) {
			System.out.println(Element.getText());
			if(Element.getText().equalsIgnoreCase(value)){
				Element.click();
				break;
			}
		}
		
	}

}
