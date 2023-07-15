package com.seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablehandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		Thread.sleep(5000);
		
		List<WebElement>li=driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
        System.out.println("table rows ::"+li.size());
        
        List<WebElement>list=driver.findElements(By.xpath("(//table)[2]/thead/tr/th"));
        System.out.println("table col ::" + list.size());
        Thread.sleep(4000);
        WebElement ele=driver.findElement(By.xpath("(//table)[2]/tbody/tr[1]/td[normalize-space()='Durable Household Goods and Equipment']"));
        
        System.out.println(ele.getText());
        for (int i = 1; i <=li.size(); i++) {
        	for (int j = 1; j <=list.size(); j++) {
			String text=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(text+"   ");
			}
			System.out.println( );
		}
        for (int i = 1; i <=li.size(); i++) {
        	String date=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[1]")).getText();
			if(date.equals("5/23/2023")){
			String issure=	driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[2]")).getText();
			String  industry =	driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[4]")).getText();
			
			System.out.println(date+" :"+issure+" :"+industry);
			}
			
			driver.close();
		}
	}

}
