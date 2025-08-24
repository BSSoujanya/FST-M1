package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
//Declare class objects
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//INitilaize driver and wait
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// open the page
		driver.get("https://alchemy.hguy.co/lms");
			}
			@Test
		public void TitlePageTest() {
			//Assertion for page title
			Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(), 'Industry')]")).getText(), "Learn from Industry Experts");
		}
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}

