package webdriver_method;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateToURL {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
		//URL -> is a java class. which takes String as an argument.
		//and it will take URL as input and its throws checked exception.
		URL mainURL = new URL("https://www.qspiders.com/");
		//sub urls create;
		URL coursesURL = new URL(mainURL,"courses");
		URL batchesURL = new URL(mainURL,"batches");
		Thread.sleep(3000);
		//to(URL url) method is a overloaded method which take URL as argument.
		//internally calls get method.
		driver.navigate().to(coursesURL);
		Thread.sleep(3000);
		driver.navigate().to(batchesURL);		
		Thread.sleep(3000);
		driver.quit();
	}
}
