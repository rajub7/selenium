package seleniumquotionsotions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import net.bytebuddy.asm.Advice.Return;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplewaits {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement ele=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    ele.sendKeys("java");
    ele.sendKeys(Keys.RETURN);
    By elm=By.xpath("//h3[normalize-space()='Java | Oracle']");
    waitforelement(driver, elm, 8).click();;
    
	}
	
	public static WebElement waitforelement(WebDriver driver,By locater,int time){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	     wait.until(ExpectedConditions.presenceOfElementLocated(locater));
		
		return driver.findElement(locater);
	}

	

}
