package testproject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testcase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
			
		
		//wait for the  elements to appear/load in the web application to avoid exception in applicaiton
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.manage().window().maximize();
        driver.get("http://www.wikipedia.org"); 

      //Explicit Wait

      //wait for the  particular defined elements in the web application to appear and avoid exception
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("js-link-box-en"))));

        //fluent to be implemented later
        
        driver.close();
	}

}
