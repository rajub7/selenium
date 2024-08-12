package seleniumquotionsotions;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.JavaScriptutils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecuter {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver(opt);
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		  
		 JavaScriptutils. drawborderjs(driver, logo);
	  String title=JavaScriptutils.gettitlejs(driver);
		  System.out.println(logo);
		  JavaScriptutils.refreshbrowser(driver);
		 // JavaScriptutils.scrollupjs(driver);
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://twoplugs.com/");
		 WebElement ele= driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
		 JavaScriptutils.clickbyjs(driver, ele);
	//	TakesScreenshot ts=(TakesScreenshot)driver;
	//	File src=ts.getScreenshotAs(OutputType.FILE);
	//	File file=new File(".\\screenshots\\twoplug.jpg");
	//	 FileUtils.copyFile(src, file);
		 driver.navigate().back();
	//	WebElement ele1= driver.findElement(By.xpath("(//a[@class='btn border'])[1]"));
		 //JavaScriptutils.clickbyjs(driver, ele1);
		// JavaScriptutils.generateAlertjs(driver, "we clicked login button");
		// driver.navigate().back();
		 WebElement ele2=driver.findElement(By.xpath("//span[normalize-space()='Read more about trust & safety']"));
		 Thread.sleep(2000);
		 JavaScriptutils.scrollintoview(driver, ele2);
		 Thread.sleep(7000);
		 JavaScriptutils.scrollupjs(driver);
		 
		 driver.quit();
		
	}

}
