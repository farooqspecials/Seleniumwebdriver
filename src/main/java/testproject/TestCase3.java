package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Locators in Action
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("http://www.wikipedia.org");  
       WebElement title= driver.findElement(By.cssSelector(" #www-wikipedia-org > div.central-textlogo > h1 > span"));
       
       String titleText=title.getText();
     
       String expectedText = "Wikipedia";
       
       
       if(titleText.equals(expectedText)) {
    	   
    	   System.out.println("test Passed");
    	   driver.close(); 
    	   
    	   
	       }else
	       {
	    	   System.out.println("Test Failed");
	    	   driver.close();
	    	 //  throw new Exception();
	       }
       
	}

}
