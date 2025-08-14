package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1 {

	public static void main(String[] args) {
		// Create a driver object
				WebDriver driver = new FirefoxDriver();
				// OPen the page
				driver.get("https://training-support.net/");
				//verify  using the page title
				System.out.println("Page title is: " +driver.getTitle());
				//Iterations
		
		// using the link name --"About Us"
		driver.findElement(By.linkText("About Us")).click();
		// using the cssSelector
		driver.findElement(By.cssSelector("a.card")).click();
		
		System.out.println("New Page Tile is :" +driver.getTitle());
		
		//CLose the browser
				driver.quit(); // closes all the tabs / closes the session
				//driver.close(); //close the active tab



	}

}
