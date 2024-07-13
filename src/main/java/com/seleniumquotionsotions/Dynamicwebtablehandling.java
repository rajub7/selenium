
package com.seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicwebtablehandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://codepen.io/yasser-mas/pen/pyWPJd");
	//	driver.findElement(By.xpath("//span[@class='mark']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='result']")));
	
		Thread.sleep(5000);
		List<WebElement>pagenation=driver.findElements(By.xpath("//div[@class='pagination-container']//ul/li/span"));

		System.out.println(pagenation.size());
		WebElement ele=driver.findElement(By.xpath("(//ul[@class='pagination']//li)[2]//span"));
    	String str=ele.getText();
    	System.out.println(str);
    	ele.click();
    	List<WebElement>li=driver.findElements(By.xpath("//table[@class='table table-striped table-class']/tbody/tr"));
    	System.out.println("rows :"+li.size());
    	List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped table-class']/thead/tr/th"));
    	System.out.println("col :"+list.size());
    	
    	for (int i = 1; i <=li.size(); i++) {
    		for (int j = 1; j <=list.size(); j++) {
    		String text=	driver.findElement(By.xpath("//table[@class='table table-striped table-class']/tbody/tr["+i+"]/td["+j+"]")).getText();
    			System.out.print(text+"  ");
				
			}
			System.out.println(  );
		}
    	driver.close();
	}

}
