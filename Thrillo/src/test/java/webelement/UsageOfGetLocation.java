package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		//getLocation() -> returns Point. point is a selenium class.
		//used to get the relative position of an element where it is rendered on the web page.
		//point class toString() is overridden, so by printing ref we will get the values.
		Point textField = driver.findElement(By.id("ta1")).getLocation();
		System.out.println(textField);
		driver.quit();		
	}
}
