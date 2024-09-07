package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		 driver.findElement(By.name("firstname")).sendKeys("Candy");
		 
		 driver.findElement(By.name("lastname")).sendKeys("Crush");
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("candycrush@gmail.com");
		
		 driver.findElement(By.name("reg_passwd__")).sendKeys("525682");
		
		 
		 WebElement Date= driver.findElement(By.id("day"));
		 Select DateDD= new Select(Date);
		 DateDD.selectByValue("28");
		 
		 WebElement Month= driver.findElement(By.id("month"));
		 Select MonthMM= new Select(Month);
		 MonthMM.selectByValue("4");
		 
		 WebElement Year= driver.findElement(By.id("year"));
		 Select YearYY= new Select(Year);
		 YearYY.selectByValue("1998"); 
		 
		 driver.findElement(By.xpath("//input[@value='1']"));
		 		 
		 
}	
}	