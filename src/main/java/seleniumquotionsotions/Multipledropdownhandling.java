package seleniumquotionsotions;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdownhandling {
      static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
        Thread.sleep(2000);
        /*Select slt=new Select(driver.findElement(By.id("day")));
         slt.selectByIndex(9);*/
       WebElement date= driver.findElement(By.id("day"));
        selectdropdown(date, "3");
        Thread.sleep(1000);
        WebElement month= driver.findElement(By.id("month"));
        selectdropdown(month, "Apr");
        Thread.sleep(1000);
        WebElement year= driver.findElement(By.id("year"));
        selectdropdown(year, "1995");
        driver.close();
	}
	
	public static void selectdropdown(WebElement el,String name){
		Select slt=new Select(el);
		List<WebElement> li=slt.getOptions();
	       for (WebElement webelt : li) {
			if(webelt.getText().equals(name)){
				webelt.click();
				break;
			}
	}
		
		
	}

}
