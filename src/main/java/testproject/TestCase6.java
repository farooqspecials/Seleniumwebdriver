package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Working with the tables
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("file:///C:/Users/Farooq/eclipse-workspace/testproject/tablePage.html");
      //  System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]")).getText());
      //  System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[3]")).getText());
        
        List <WebElement> tablelist= driver.findElements(By.xpath("/html/body/table/tbody[1]/tr"));
        
        for (WebElement i : tablelist) {
        	 
            // Print all elements of ArrayList
            System.out.println(i.getText());
        }
        
        driver.close();

	}

}
