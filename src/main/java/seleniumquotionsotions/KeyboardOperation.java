package seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver(opt);
	     driver.get("https://the-internet.herokuapp.com/key_presses");
	     Thread.sleep(4000);
	     Actions act=new Actions(driver);
	     act.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(2000);
	      act.sendKeys(Keys.ARROW_DOWN).perform();
	      Thread.sleep(2000);
	      act.sendKeys(Keys.ARROW_RIGHT).perform();
	      Thread.sleep(2000);
	      
	      driver.close();
	}

}
