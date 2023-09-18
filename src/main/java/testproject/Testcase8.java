package testproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase8 {

	public static void main(String[] args) {
		
		// Just for learning purposes this script might not work properly
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
			
		
		//wait for the  elements to appear/load in the web application to avoid exception in applicaiton
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.manage().window().maximize();
        driver.get("http://www.udemy.com"); 
        WebElement signUpButton= driver.findElement(By.cssSelector("#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-header.ud-text-sm.desktop-header-module--header--3nb6v.desktop-header-module--flex-middle--1e7c8 > div:nth-child(9) > a > span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        //Changing the webpage
        ((JavascriptExecutor) driver).executeScript("window.location = 'https://wikipedia.com'");
      //Scroll the webpage
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
	}

}
