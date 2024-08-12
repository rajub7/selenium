package seleniumquotionsotions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureSizeAndLocation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement elem=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		int l=elem.getLocation().getX();
		int m=elem.getLocation().getY();
		System.out.println(l);
		System.out.println(m);
		int n= elem.getRect().getX();
		int o=elem.getRect().getX();
		System.out.println(n);
		System.out.println(o);
		int p=elem.getSize().getHeight();
		int q=elem.getSize().getWidth();
		System.out.println(p);
		System.out.println(q);
		
    }
}
