package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//initialized chrome driver 
		ChromeDriver driver= new ChromeDriver();
		
		//lauch the website using get()
		driver.get(" http://leaftaps.com/opentaps/");
		
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
		
        /*Why classname is not accepting?
        driver.findElement(By.className("x-panel-header")).click();*/
        
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
		
      //Locate the companyName field and enter the company name as TestLeaf
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
        
		//Locate the last name field and enter the last name as Sekar
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Director");
       
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
