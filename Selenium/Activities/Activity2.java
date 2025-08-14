package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) {
		// Create a driver object
				WebDriver driver = new FirefoxDriver();
				// OPen the page
				driver.get("https://training-support.net/webelements/login-form");
				//verify  using the page title
				System.out.println("Page title is: " +driver.getTitle());
				//Iterations
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
				// Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
		
		//CLose the browser
				driver.quit(); // closes all the tabs / closes the session
				//driver.close(); //close the active tab
	}
}
