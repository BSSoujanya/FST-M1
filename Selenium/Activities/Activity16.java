package activities;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity16 {

	public static void main(String[] args) {
		 // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
     
	        	        // Open the page
	        driver.get("https://training-support.net/webelements/selects");
	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        // Find the dropdown
	        WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
	     // Pass the WebElement to the Select object
	        Select singleSelect = new Select(dropdown);
	        
	     // Select the second option using visible text
	        singleSelect.selectByVisibleText("One");
	        System.out.println("Second Option: " +singleSelect.getFirstSelectedOption().getText());
	        
	     // Select the third option using Index 
	        singleSelect.selectByIndex(2);
	        System.out.println("Third Option: " +singleSelect.getFirstSelectedOption().getText());
	      
	     // Select the fourth option using value attribute
	        singleSelect.selectByValue("four");
	        System.out.println("Fourth Option: " +singleSelect.getFirstSelectedOption().getText());
	        
	        // Print all the options
	        
	        List<WebElement> alloptions = singleSelect.getOptions();
	        System.out.println("Options inthe drop down: ");
	        for(WebElement option : alloptions) {
	        	System.out.println(option.getText());
	        
	        }
        
	        // Close the browser
	        driver.quit();  
	}

}
