package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getWindowHandel return current window id in form of String
		String windowID = driver.getWindowHandle();
		System.out.println("Current Window ID: \n"+windowID);
		driver.quit();
	}
}
