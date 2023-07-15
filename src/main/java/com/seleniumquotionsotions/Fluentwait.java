package com.seleniumquotionsotions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    
    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(4))
    .pollingEvery(Duration.ofSeconds(4))
    .ignoring(NoSuchElementException.class);
    
    driver.get("https://www.google.com");
    WebElement ele=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    ele.sendKeys("java");
    ele.sendKeys(Keys.RETURN);
    
   WebElement elem= wait.until(new Function<WebDriver, WebElement>() {


	public WebElement apply(WebDriver t) {
	
		return driver.findElement(By.xpath("//h3[normalize-space()='Java | Oracle']"));
	}
	   
	});
    
    elem.click();
    
    driver.close();
    
	}

}
