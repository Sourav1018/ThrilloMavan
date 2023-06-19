package webdriver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//Dimension is a selenium class.
		Dimension totalDimension = new Dimension(1000, 600);
		//we are use setSize() to resize the window.
		driver.manage().window().setSize(totalDimension);
		Thread.sleep(2000);
		driver.quit();
	}
}
//note: when ever we are using setSize() method we have to use selenium Dimension class reference inside it.