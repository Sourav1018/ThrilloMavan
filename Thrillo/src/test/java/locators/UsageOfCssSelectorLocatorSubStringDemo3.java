package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCssSelectorLocatorSubStringDemo3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		///cssSelector by matching sub-string suffix.
		//syntax -> <HTML tag><[attribute*=sub string]>
		//         *: the symbol to match a string using sub-string
	    //Sub string: the string based on which the match operation is performed.
		 WebElement passwordTextBox =
				 driver.findElement(By.cssSelector("input[type*='sw']"));
		 passwordTextBox.sendKeys("hello-world");
		 driver.quit();
	}
}
