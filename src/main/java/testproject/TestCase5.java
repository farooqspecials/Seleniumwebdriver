package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Sent Keys in Text Box
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("http://www.wikipedia.org");  
        
        WebElement searchTextbox = driver.findElement(By.id("searchInput"));
        String searchText= "Selenium WebDriver";
        searchTextbox.sendKeys(searchText);
        
        WebElement searchButton= driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();
        
        driver.close();

	}

}
