package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// Create a driver object
		WebDriver driver = new FirefoxDriver();
		// OPen the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//verify  using the page title
		System.out.println("Page title is: " +driver.getTitle());
		
				  // Find the textfield
        WebElement textbox = driver.findElement(By.id("textInput"));
     // check if it is enabled
        System.out.println("Input field in enabled: " + textbox.isEnabled());
       //Click the toggle button to enable it
        driver.findElement(By.id("textInputButton")).click();
     // Check if the text is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
       //type something in it
        textbox.sendKeys("Samle text");
                     System.out.println(textbox.getDomProperty("value"));

        // Close the browser
        driver.quit();
        
	}

}

