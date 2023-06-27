package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmayoIcon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement iconElement = driver
		.findElement(By.cssSelector("a[id='b-navbar-logo']"));
		 boolean iconDisplayed = iconElement.isDisplayed();
		 System.out.println("isDisplay()-> "+iconDisplayed);
		boolean iconEnable = iconElement.isEnabled();
		System.out.println("isEnable()-> "+iconEnable);
		boolean iconSelected = iconElement.isSelected();
		System.out.println("isSelected()-> "+iconSelected);
		Actions action = new Actions(driver);
		action.moveToElement(iconElement).click().perform();
		driver.quit();
	}
}
