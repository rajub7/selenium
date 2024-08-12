package seleniumquotionsotions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'][contains(text(),'▼')])[1]")).click();
		selectdropdownchoice(driver, "choice 2" ,"choice 2 1","choice 2 2","choice 4","choice 5");
		driver.findElement(By.xpath("//input[@id='justAnotherInputBox']")).click();
		selectdropdownchoice(driver, "all");
		driver.close();
	}
	public static void selectdropdownchoice(WebDriver driver,String...value){
		List<WebElement> li=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(li.size());
		
		if(!value[0].equalsIgnoreCase("all")){
            for (WebElement ele : li) {
			String name=ele.getText();
			
			for ( String str: value) {
				if(name.equals(str)){
					ele.click();
				}	
			}
			
			}		
		}else{
			for (WebElement webElement : li) {
				webElement.click();
			}
		}
	}

}
