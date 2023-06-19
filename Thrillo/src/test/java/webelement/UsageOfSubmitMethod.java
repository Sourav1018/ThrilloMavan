package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitMethod {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/");
		//submit() -> The submit() function is applicable only for <form> and makes handling of form easier. It can be used with any element inside a form.
		//if we use outside of form tag  then we will get RE:java.lang.unsupportedOperationException.
		driver.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(5000);
		driver.quit();
	}
}
