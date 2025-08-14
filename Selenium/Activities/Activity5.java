package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity5 {

	public static void main(String[] args) {
		// Create a driver object
		WebDriver driver = new FirefoxDriver();
		// OPen the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//verify  using the page title
		System.out.println("Page title is: " +driver.getTitle());
		
				  // Find the checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));
     // Find the toggle button and click it
        driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();
     // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        // Close the browser
        driver.quit();
        
	}

}
