package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase4 {

	public static void main(String[] args) {
		// click function in selenium
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "./"+"\\Drivers\\geckodriver.exe");
        driver.get("http://www.wikipedia.org");  
        
        WebElement linkbutton= driver.findElement(By.id("js-link-box-en"));
        linkbutton.click();
        String Expectedtitle="Welcome to Wikipedia";
        WebElement titleofEnglishPage= driver.findElement(By.xpath("//*[@id=\"Welcome_to_Wikipedia\"]"));
        String Actualtitle= titleofEnglishPage.getText();
        if(Actualtitle.equals(Expectedtitle)) {
        	System.out.println("Test Passed");
        	driver.close();

	}else
	{
		System.out.println("Test Failed");
		driver.close();
		
	}

}
}
