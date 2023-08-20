package com.seleniumquotionsotions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinkshandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement>li=driver.findElements(By.tagName("a"));
		int brokenlinks = 0;
		for (WebElement ele : li) {
		
			String url=ele.getAttribute("href");
			if(url==null||url.isEmpty()){
				System.out.println("url is empty");
				continue;
			}
	
			try {
				URL link = new URL(url);
				HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
				httpcon.connect();
				
				if(httpcon.getResponseCode()>400){
					System.out.println(httpcon.getResponseCode()+url+" is"+"brokenlink");
					brokenlinks++;
				}
				else{
					
					System.out.println(httpcon.getResponseCode()+url+" is"+"validlink");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println(brokenlinks);
       }
    }

