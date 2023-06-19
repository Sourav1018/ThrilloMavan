package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		//Instantiate browser 
		WebDriver driver = new ChromeDriver();
		//get pass url of website its take string as an argument
		driver.get("https://www.instagram.com/");
		//post condition
		driver.quit();
	}
}
