package seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggectdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.google.com");
   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
   Thread.sleep(4000);
   List<WebElement>li=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='presentation']//span"));
   System.out.println(li.size());
   for (WebElement web : li) {
	System.out.println(web.getText());
	if(web.getText().equalsIgnoreCase("java interview questions")){
		web.click();
		break;
	}
}
   driver.close();
	}

}
