package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// Create a driver object
		WebDriver driver = new FirefoxDriver();
		// OPen the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//verify  using the page title
		System.out.println("Page title is: " +driver.getTitle());
		
				  // Find the checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));
     // click it
       checkbox.click();
     // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
       //click the checkbox again
        checkbox.click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        // Close the browser
        driver.quit();
        
	}

}
