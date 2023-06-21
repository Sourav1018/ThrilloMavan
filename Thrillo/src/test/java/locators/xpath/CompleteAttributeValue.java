package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteAttributeValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		//xpath by Complete Attribute value
		WebElement image = 
		driver.findElement(By.xpath("//img[@src='https://assets.about.me/background/www.softwaretestingcollege.blogspot.com_1330713399_12.jpg']"));
		boolean isImageDisplay = image.isDisplayed();
		System.out.println("Is Image displayed : " + isImageDisplay);
		driver.quit();
	}
}
