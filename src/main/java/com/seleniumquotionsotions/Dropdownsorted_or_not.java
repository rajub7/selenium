package com.seleniumquotionsotions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.twoplugs.com");
       driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
      WebElement ele= driver.findElement(By.xpath("//select[@name='category_id']"));
      Select slt=new Select(ele);
      List<WebElement>orgli = slt.getOptions();
      System.out.println(orgli.size());
      ArrayList fis=new ArrayList();
      ArrayList sec=new ArrayList();
      
      for (WebElement elmt : orgli) {
    	fis.add(elmt.getText());
		sec.add(elmt.getText());
	}
      System.out.println("orginal :"+fis);
      System.out.println("duplicate :"+sec);
      
      Collections.sort(sec);
      
      System.out.println("orginal :"+fis);
      System.out.println("duplicate :"+sec);
      if(fis.equals(sec)){
    	  System.out.println("dropdown sorted");
      }else{
    	  System.out.println("not sorted");
      }
      driver.close();
	}

}
