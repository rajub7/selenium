package com.seleniumquotionsotions;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepickerhandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
		     WebDriver driver=new ChromeDriver(opt);
		     driver.get("https://www.makemytrip.com/charter-flights/");
		     driver.manage().window().maximize();
		     driver.findElement(By.xpath("//span[@class='chNavText darkGreyText reduceMenuSpacing']")).click();
		     driver.findElement(By.xpath("//label[@for='departure']")).click();
		     String date="17";
		     String month="November";
		     String year="2023";
		    while(true){
		    	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='webengage-engagement-callback-frame']")));
		    	
		      String text=driver.findElement(By.xpath("//div[contains(text(),'June 2023')]")).getText();
		      System.out.println(text);
		    	String[] arr= text.split(" ");
		    	String v1=arr[0];
		    	String v2=arr[1];
		    	if(v1.equalsIgnoreCase(month)&&v2.equalsIgnoreCase(year)){
		    		break;
		    	}
		    	else{
		    		
			    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='webengage-engagement-callback-frame']")));
		    		WebElement ele=driver.findElement(By.xpath("(//span[@aria-label='Next Month'])[1]"));
		    		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		    		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
                 

		    	}
		    }
		  List<WebElement>li=  driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div//div[@class='DayPicker-Day']"));
		    System.out.println(li.size());
		  for (WebElement webEle : li) {
			String dates=  webEle.getText();
			if(dates.equals(date)){
				webEle.click();
			}
			
		}
         driver.findElement(By.xpath("//li[normalize-space()='03:00']")).click();
	}

}
