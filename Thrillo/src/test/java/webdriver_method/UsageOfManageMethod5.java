package webdriver_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		Point newStartingPoint = new Point(500,500);
		driver.manage().window().setPosition(newStartingPoint);
		
		driver.quit();
	}
}
/*
 * note: 
 * when we are using the setPosition method we have to create the object of the Point class .
 * which is present inside the selenium library.
 * its having one constructor which take int x and int y as argument. 
 * we have to pass the object reference of point to setPosition() argument.
 * it will set the new position of the browser.
 */
