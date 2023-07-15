package com.seleniumquotionsotions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Displayelementsornot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       /* driver.get("https://www.nopcommerce.com/en");
        Boolean show=driver.findElement(By.xpath("//span[contains(text(),'Partners')]")).isDisplayed();
        System.out.println("show :"+show); */
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
        Thread.sleep(5000);
       WebElement name= driver.findElement(By.xpath("(//div[@class='_52lr fsm fwn fcg'])[1]"));
       System.out.println(name.getText());
        Thread.sleep(3000); 
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("raju");
         WebElement elmt=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
        elmt.click();
      Boolean display=elmt.isSelected();
      System.out.println("radio button selected :"+display);
      Boolean display1=driver.findElement(By.xpath("//label[normalize-space()='Male']")).isSelected();
        
        System.out.println("radio button selected :"+display1);
       Boolean enble=driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
        System.out.println("enble :"+enble);
       driver.close();
	}

}
