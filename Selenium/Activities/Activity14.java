package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page Title: " +driver.getTitle());
		
		//print the number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println("Number of columns: " +cols.size());
		
		// Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        
     // Print the Book Name in the 5th row
        WebElement cellvalue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        System.out.println("Book name displayed: " +cellvalue.getText());
        
     //sort the table
        driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
       
     //Print the cell value of fifth row and second column again
        cellvalue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        System.out.println("Book names after sorting: " +cellvalue.getText());
        

        // Close the browser
        driver.quit();
        
        	
	}

}
