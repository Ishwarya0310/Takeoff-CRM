package LGTM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.ListenerReport;


@Listeners(ListenerReport.class)

public class Global_Search {
	
	@Test(priority=1)
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
		
		driver.get("https://crm.php.ymtsindia.org/");
	
		// THIS IS FOR THE 'LOGIN' FEATURE IN TAKEOFF CRM WEB APPLICATION
				//Provide user name
				WebElement username= driver.findElement(By.name("username"));
				username.isDisplayed();
				username.isEnabled();
				username.sendKeys("HARATHI");
				
				//Provide password
				WebElement password  =  driver.findElement(By.name("password"));
				password.isDisplayed();
				password.isEnabled();
				password.sendKeys("123");
						
				//Clicking on login button
				driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
				
				
				driver.findElement(By.xpath("//i[@class='ficon feather icon-search']")).click();
				
				
				
		      
		        // Select Department
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//select[@id='searchby']")).click();
				
				Thread.sleep(5000);
			   
			   List<WebElement> allDropDownValuesstate=driver.findElements(By.xpath("//option[@value='enq_id']"));
				 
			   
		       // Printing the amount of WebElements inside the list
		      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

		       // Condition to get the WebElement for list
		       for(int i=0; i<allDropDownValuesstate.size(); i++)
		       {
		            // Printing All the options from the dropdown
		    	    
		           // System.out.println(allDropDownValuesstate.get(i).getText());
		            				            
		          //Thread.sleep(5000);  
		            
		            if(allDropDownValuesstate.get(i).getText().contains("Enquiry Id"))
		            {
		            	
		                 // Clicking if text "Checkbox Demo" is there
		            	allDropDownValuesstate.get(i).click();
		            	
		              // Breaking the condition if the condition get satisfied
		                 break;
		          }
		            
		       }    
		         
		       WebElement serachteam = driver.findElement(By.name("myCountry"));
		       serachteam.isDisplayed();
		       serachteam.isEnabled();
		       serachteam.clear();
		       serachteam.sendKeys("TK38");  
		       serachteam.sendKeys(Keys.ENTER);
	}
	

}
