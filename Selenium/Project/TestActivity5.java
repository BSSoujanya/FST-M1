package Project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5{
//Declare class objects
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//INitilaize driver and wait
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// open the page
		driver.get("https://alchemy.hguy.co/lms/");
			}
			@Test
			public void NavigateToAnotherPage() {
				//Select the menu item that says “My Account” and click it
				WebElement navElement = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
				navElement.click();
				
				//e. Read the page title and verify that you are on the correct page.
				String titleString= driver.getTitle();
				System.out.println("Title of page: "+ titleString);
				Assert.assertEquals(titleString, "My Account – Alchemy LMS");
			}
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}


