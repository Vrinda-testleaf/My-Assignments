package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialized chrome driver 
				ChromeDriver driver= new ChromeDriver();
				
				//lauch the website using get()
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Command to print the website name
				System.out.println(driver.getTitle());
				
				//passing credentials using id locator by giving the inpu using "sendKeys"
		        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		        driver.findElement(By.id("password")).sendKeys("crmsfa");
		        
		        //To click login button
		        driver.findElement(By.className("decorativeSubmit")).click();
		        
		        //instead of using LinkText, we used id locator.
		        driver.findElement(By.id("label")).click();
		        
		        
		        driver.findElement(By.linkText("Accounts")).click();
		        
		        driver.findElement(By.linkText("Create Account")).click();
				
		        driver.findElement(By.name("accountName")).sendKeys("Selenium Automation Tester");
		
		        driver.findElement(By.name("numberEmployees")).sendKeys("5");
		
		        driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		
		        driver.findElement(By.className("smallSubmit")).click();
	
		        String title = driver.getTitle();
				System.out.println(title);
				
				driver.close();
	
	
	
	
	
	}

}
