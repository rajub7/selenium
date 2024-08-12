package seleniumquotionsotions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Multiplekeyboardoperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://text-compare.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	    WebElement ele1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    WebElement ele2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	    ele1.sendKeys("welcome to selenium");
	    Actions act=new Actions(driver);
	    
	    //control+A
	    
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    //Control+C
	    
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    //Tab
	    act.sendKeys(Keys.TAB);
	    act.perform();
	    
	    //Control+v
	    
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    if(ele1.getAttribute("value").equals(ele2.getAttribute("value"))){
	    	System.out.println("compared");
	    }else{
	    	System.out.println("not compared");
	    }
	     driver.close();
	}

}
