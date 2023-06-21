package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCssSelectorLocatorSubStringDemo1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//cssSelector by matching sub-string prefix.
		//syntax -> <HTML tag><[attribute^=prefix of the string]>
		//    ^ : the symbol used to match a string using a prefix
	   // Prefix: the string based on which the match operation is performed.
		WebElement passwordTextField = driver.findElement(By.cssSelector("input[type^='pass']"));
		passwordTextField.sendKeys("hello-world");
		Thread.sleep(2000);
		driver.quit();
	}
}
