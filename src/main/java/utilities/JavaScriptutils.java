package utilities;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptutils {

	public static void drawborderjs(WebDriver driver,WebElement ele) {
		// TODO Auto-generated method stub
		try{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
		
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static String gettitlejs(WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		return title;

	}
	public static void clickbyjs(WebDriver driver,WebElement ele) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	
	}
	public static void generateAlertjs(WebDriver driver,String msg) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+msg+"')");
	
	}
	public static void refreshbrowser (WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go[0]");
	
	}
	public static void scrolldownjs (WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	}
	public static void scrollupjs (WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	}
	public static void zoomup(WebDriver driver) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
	
	}
	public static void scrollintoview (WebDriver driver,WebElement ele) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	
	}
}
