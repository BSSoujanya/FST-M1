package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity7{
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
			public void CountNumberOfCources() {
				//c. & d. Find the navigation bar and Select the menu item that says “All Courses” and click it
				WebElement navElement = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
				navElement.click();
				
				List<WebElement> courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));;
				System.out.println("Number of courses: "+ courses.size());		
				
			}
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}


