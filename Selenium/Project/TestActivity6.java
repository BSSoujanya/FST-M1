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

public class TestActivity6{
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
				
				//Read the page title and verify that you are on the correct page.
				String titleString= driver.getTitle();
				System.out.println("Title of page: "+ titleString);
				Assert.assertEquals(titleString, "My Account – Alchemy LMS");
				
				//Find the “Login” button on the page and click it.
				WebElement loginElement = driver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
				loginElement.click();
				
				//Enter username and password
				WebElement userNamElement = driver.findElement(By.xpath("//input[@id='user_login']"));
				WebElement passwordElement = driver.findElement(By.xpath("//input[@id='user_pass']"));
				userNamElement.sendKeys("root");
				passwordElement.sendKeys("pa$$w0rd");
				
				//click login button
				driver.findElement(By.id("wp-submit")).click();
				
				//verify
				String editProfile = driver.findElement(By.xpath("//a[@class='ld-profile-edit-link']")).getText();
				Assert.assertEquals(editProfile, "Edit profile");
			}
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}


