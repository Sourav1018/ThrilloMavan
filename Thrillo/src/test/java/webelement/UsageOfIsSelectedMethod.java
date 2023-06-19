package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//isSelected() -> returns boolean value.
		//it checks the particular webelement is selected or not.
		boolean chekboxSelected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(chekboxSelected);
		driver.quit();
	}
}
