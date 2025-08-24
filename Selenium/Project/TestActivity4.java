package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity4{
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
	    public void SecondMostPopularCourse() {
				List<WebElement> headings = driver.findElements(By.xpath("//h3[@class='entry-title']"));
				WebElement secondHeadingString = headings.get(1); 
				System.out.println("Second most popular string: "+ secondHeadingString.getText());
				
				//d.
				Assert.assertEquals(secondHeadingString.getText(), "Email Marketing Strategies");
	    }
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}


