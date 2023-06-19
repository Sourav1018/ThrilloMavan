package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchToForNewWindow {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		//switchTo method will return targetLocator
		driver.switchTo().newWindow(WindowType.WINDOW);//--> new Window create
		//newWindow method will return WebDriver
		//parameter WindowType(enum) ->it will be WINDOW(Static Final Variable) type 
		driver.get("https://www.facebook.com/");
		driver.quit();		
	}
}
