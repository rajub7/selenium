package com.seleniumquotionsotions;

import java.util.List;

import org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectcheckboxoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://itera-qa.azurewebsites.net/home/automation");
     //select one checkbox
     
    driver.findElement(By.xpath("//input[@id='monday']")).click();
    
     // select all checkboxs
     
    List<WebElement> li= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
   /* for (WebElement Element : li) {
    	Element.click();
	    } 
    // select by choices checkbox   
    for (WebElement webElement : li) {
		String text=webElement.getAttribute("id");
		if (text.equals("monday")||text.equals("friday")) {
			webElement.click();		
		}
	   } 
    // select last 3 checkboxes
      for (int i = li.size()-3; i < li.size(); i++) {
		li.get(i).click();	
	  }*/
    // select first 2 checkboxes
    for (int i = 0; i < li.size(); i++) {
    	if(i<3){
    		li.get(i).click();
         }	
	    }
    driver.close();
	  }
     }
