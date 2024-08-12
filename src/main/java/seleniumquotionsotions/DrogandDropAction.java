package seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DrogandDropAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(4000);
		WebElement src=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box3']"));
		WebElement trgc=driver.findElement(By.xpath("//div[@id='countries']//div[@id='box103']"));
		
		WebElement src1=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box1']"));
		WebElement trgc1=driver.findElement(By.xpath("//div[@id='countries']//div[@id='box101']"));
		
		WebElement src2=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box6']"));
		WebElement trgc2=driver.findElement(By.xpath("//div[@id='countries']//div[@id='box106']"));
		
		WebElement src3=driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box2']"));
		WebElement trgc3=driver.findElement(By.xpath("//div[@id='countries']//div[@id='box102']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, trgc).perform();
		act.dragAndDrop(src1, trgc1).perform();
		act.dragAndDrop(src2, trgc2).perform();
		act.dragAndDrop(src3, trgc3).perform();
		
		driver.close();


		
	}

}
