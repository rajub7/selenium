package com.testng;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.jsoup.parser.ParseError;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utilities.JavaScriptutils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartApp {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(4000);
       
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Notebooks']")).click();
		JavaScriptutils.scrolldownjs(driver);
		
		List<WebElement>li=driver.findElements(By.xpath("//h2[@class='product-title']"));
	
		
		List<WebElement>li1=driver.findElements(By.xpath("//span[@class='price actual-price']"));
		
	
		
		
  	Map<String,Float> mp=new HashMap<String,Float>();
		
		for (int i = 0; i <li.size(); i++) {
			
			String name=li.get(i).getText();
			String price=li1.get(i).getText();
			String p1=price.replaceAll("[^0-9 .]", " ");
			String p2=p1.replaceAll("\\s", "");
			
			 Float d1=Float.parseFloat(p2);
			 
			 mp.put(name, d1);
			
		}
		
		for (Entry<String, Float> ent : mp.entrySet()) {
			
			if (ent.getValue()>1400.00) {
				System.out.println(ent.getKey()+"   ::: "+ent.getValue());
			}
				
		}
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File file=new File(".\\screenshot\\elem.png");
	FileUtils.copyFile(src, file);
		
	/*	@SuppressWarnings("rawtypes")
		ArrayList fis=new ArrayList();
		
		@SuppressWarnings("rawtypes")
		ArrayList sec=new ArrayList();
				
		for (WebElement webElement : li1) {
			fis.add(webElement.getText());
			sec.add(webElement.getText());	
		}
		
		System.out.println("original"+fis);
		
		System.out.println("original"+sec);
		
		Collections.sort(sec);
		
         System.out.println(fis);
         
         System.out.println(sec);
         
         if (fis.equals(sec)) {
        	 System.out.println("sorted");
			
		}else {
			System.out.println("not sorted");
		} */
         
	}
}
