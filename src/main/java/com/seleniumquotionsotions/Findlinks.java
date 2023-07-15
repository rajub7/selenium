package com.seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findlinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.amazon.com");
            driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
            driver.findElement(By.linkText("Today's Deals")).click();;
            Thread.sleep(3000);
            driver.navigate().back();
            driver.findElement(By.partialLinkText("Service")).click();
            driver.navigate().back();
            List<WebElement>li=driver.findElements(By.tagName("a"));
            System.out.println(li.size());
//            for (WebElement Ele : li) {
//				System.out.println(Ele.getText());
//			}
            driver.close();
            
	}

}
