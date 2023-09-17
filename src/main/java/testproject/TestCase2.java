package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// CSS Locators
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("http://www.wikipedia.org");
        
        
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();
        System.out.println("The time needed to get a locator by ID is: " + (end - start));

        
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/a/strong"));
        end = System.currentTimeMillis();
        System.out.println("The time needed to get a locator by xpath is: " + (end - start));

        
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#js-link-box-de"));
        end = System.currentTimeMillis();
        System.out.println("The time needed to get a locator by css is: " + (end - start));

        driver.close();
	}

}
