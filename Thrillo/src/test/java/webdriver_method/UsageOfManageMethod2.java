package webdriver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//Dimension is selenium class.
		Dimension sizeOfTheWindow = driver.manage().window().getSize();
		System.out.println("Total width and height of Current Window :"+sizeOfTheWindow);
		//Dimention is selenium class which contains two method getHeight and getWidth.
		int height = sizeOfTheWindow.getHeight();
		System.out.println("Height of the current window :"+height);
		int width = sizeOfTheWindow.getWidth();
		System.out.println("Width of the current window :"+width);
		driver.quit();
	}
}
