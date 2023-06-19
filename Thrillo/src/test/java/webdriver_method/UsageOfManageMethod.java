package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//per condition
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/");
		//full screen method call
		driver.manage().window().fullscreen();
		//post condition
		driver.manage().window().minimize();
		//driver.close();
		driver.quit();
	}
}
