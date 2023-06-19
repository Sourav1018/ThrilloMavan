package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateMethods {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.get("https://www.facebook.com/");
		//navigate -> navigation on a window tab. 1.back 2.forward 3.refresh
		//4.to(String url) -> internally calls get method. in current window tab it will open the url.
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");
		driver.quit();
	}
}
