package com.seleniumquotionsotions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     Thread.sleep(4000);
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     Alert alt=driver.switchTo().alert();
     alt.accept();
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
     Alert alt1=driver.switchTo().alert();
    String text =alt1.getText();
    System.out.println(text);
    if(text.equals("I am a JS Confirm")){
    	alt1.accept();
    }else{
    	alt1.dismiss();
    }
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
    Alert altr=driver.switchTo().alert();
     String str= altr.getText();
     System.out.println(str);
      altr.sendKeys("welcome");
      altr.accept();
      
      driver.close();
      
	}

}
