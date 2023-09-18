package testproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase9 {

	public static void main(String[] args) throws InterruptedException  {
		// Alerts in Selenium Web Driver. Main concepts are in the code. Code behaviour is not proper some times
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("file:///C:/Users/Farooq/eclipse-workspace/testproject/alerts.html");
        
        WebElement basicAlertButton=driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationButton=driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement promptbutton =driver.findElement(By.cssSelector("body > button:nth-child(8)"));
        //alert no 1 basic alert
         basicAlertButton.click();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         
        
       wait.until(ExpectedConditions.alertIsPresent());
         Alert basicAlert=driver.switchTo().alert();
        
         Thread.sleep(3000);
        	
         
           basicAlert.accept();
         
        
        
        //alert no 2 confirmation alert
        confirmationButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmationp=driver.switchTo().alert();
        Thread.sleep(3000);
        confirmationp.dismiss();
        
        //alert no 3 form alert
        promptbutton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("Farooq");
        
        Thread.sleep(3000);
           	
        prompt.accept();
       
        
        

	}

}
