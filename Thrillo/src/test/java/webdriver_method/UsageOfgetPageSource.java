package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getPageSource return whole page source code in the form of String
		String sourcePage = driver.getPageSource();
		System.out.println(sourcePage);
		driver.quit();
	}
}
