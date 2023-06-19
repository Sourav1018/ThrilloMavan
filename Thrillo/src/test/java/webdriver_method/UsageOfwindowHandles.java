package webdriver_method;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfwindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		//getWindowsHandles return set of windowID in the form of Set<String>.	
		Set<String> windowID = driver.getWindowHandles();
		System.out.println(windowID);
		driver.quit();
	}
}
