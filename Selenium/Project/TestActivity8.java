package Project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity8{
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
			public void ContactTheAdmin() {
				//c. & d. Find the navigation bar and Select the menu item that says “Contact” and click it
				WebElement navElement = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
				navElement.click();
				
				//e. & f. Find the contact form fields (Full Name, email, etc.) and Fill in the information and leave a message
				driver.findElement(By.xpath("//input[@name='wpforms[fields][0]']")).sendKeys("Aaditri");
				driver.findElement(By.xpath("//input[@name='wpforms[fields][1]']")).sendKeys("Aaditri@gmail.com");
				driver.findElement(By.xpath("//input[@name='wpforms[fields][3]']")).sendKeys("Test");
				driver.findElement(By.xpath("//textarea[@name='wpforms[fields][2]']")).sendKeys("Test Message");
				
				//g. Click submit
				driver.findElement(By.xpath("//button[contains(text(),\"Send Message\")]")).click();
				
				//h. Read and print the message displayed after submission.
				String messageString = driver.findElement(By.xpath("//p[contains(text(),\"Thanks\")]")).getText();
				System.out.println("Message: "+ messageString);
				
				
			}
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}


