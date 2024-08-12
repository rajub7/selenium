package seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetattributeandGettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String name=driver.findElement(By.xpath("//strong[normalize-space()='Welcome, please sign in!']")).getText();
		System.out.println(name);
		WebElement ele=driver.findElement(By.xpath("//input[@id='Email']"));
		String str=ele.getAttribute("value");
		System.out.println(str);
		ele.clear();
		ele.sendKeys("admin@2003");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='Password']"));
		String str1=ele1.getAttribute("value");
		System.out.println(str1);
		ele1.clear();
		ele1.sendKeys("stone");
		driver.close();
	}

}
