package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase12 {

	public static void main(String[] args) {
		// TODO drag and drop
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	    
	    
	    WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(draggable, droppable).build().perform();
        
        Actions contextClick = new Actions(driver);

        contextClick.contextClick().build().perform();

        Actions actionObj = new Actions(driver);
        actionObj.keyDown(Keys.F1);
        
        driver.close();



	    

	}

}
