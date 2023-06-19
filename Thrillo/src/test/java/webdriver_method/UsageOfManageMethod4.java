package webdriver_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod4 {
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.manage().window().maximize();
		 * whenever we are useing pre condition for maximize the browser we will get values as -ve.
		 */
		driver.get("https://demo.actitime.com/");
		//point is a selenium class.
		//getPosition() returns Point. it denotes where the current window's starting position is.
		//it gives us value as coordinates means X and Y axis value.
		Point getPosoition = driver.manage().window().getPosition();
		System.out.println(getPosoition);
		//Point class contains Two method getX() and getY() 
		//getX() -> returns the starting position of x.
		//getY() -> returns the starting position of y.
		//for access those method we have to use the Point class reference.
		int startingPositionX = getPosoition.getX();
		System.out.println("Starting position of X :"+startingPositionX);
		int startingPositionY = getPosoition.getY();
		System.out.println("Starting position of Y :"+startingPositionY);
		driver.quit();
	}
}
