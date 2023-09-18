package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
	        driver.get("https://www.w3schools.com/html/html_iframe.asp");

	    //    String title = driver.switchTo().frame(0).findElement(By.cssSelector("#main > h1")).getText();
	     //   System.out.println(title);

	        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));

	        driver.switchTo().frame(iframe).findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(5)")).click();

	        driver.close();
	}

}
