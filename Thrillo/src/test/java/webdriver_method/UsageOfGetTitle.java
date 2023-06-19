package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//getTitle will return Title of the webpage in form of String
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
