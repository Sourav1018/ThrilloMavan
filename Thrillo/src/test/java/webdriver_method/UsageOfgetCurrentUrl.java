package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getCurrentUrl will return current URL in form of String
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.quit();
	}
}
