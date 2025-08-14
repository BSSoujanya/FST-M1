package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
	public static void main(String[] args) {
		// Create a driver object
				WebDriver driver = new FirefoxDriver();
				// OPen the page
				driver.get("https://training-support.net/webelements/target-practice");
				//verify  using the page title
				System.out.println("Page title is: " +driver.getTitle());
				//Iterations
				// Find the 3rd header and print its text
				 String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();	
				 System.out.println(thirdHeaderText);
				  // Find the 5th header and print its color	
				 Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
				// System.out.println("Color as RGB: " + fifthHeaderColor);   
				 System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
			     System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
					

			        // Find the violet button and print its classes
			        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("class");
			        System.out.println(purpleButtonClass);
			        // Find the grey button and print its text
			        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
			        System.out.println(slateButtonText);
		
		//CLose the browser
				driver.quit(); // closes all the tabs / closes the session
				//driver.close(); //close the active tab
	}
}
