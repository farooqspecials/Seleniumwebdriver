package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase11 {

	public static void main(String[] args) {
		// Select the index from the dropdown
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");		
	    driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	    WebElement selectable=driver.findElement(By.id("cars"));
	    Select select=new Select(selectable);
	    select.selectByIndex(1);
	    driver.close();

	}

}
