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

public class TestActivity3{
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
	    public void FirstInfoBoxTitle() {
	      WebElement firstInfoBoxTitle = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])"));
	      
	        // d. Get the text and verify it matches "Actionable Training"
	        String actualTitle = firstInfoBoxTitle.getText();
	        String expectedTitle = "Actionable Training";
	        System.out.println("Title of the first info box: "+actualTitle);
	        Assert.assertEquals(actualTitle, expectedTitle, "Info box title does not match!");
	    }
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}

