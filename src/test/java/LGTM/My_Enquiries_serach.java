package LGTM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.ListenerReport;


@Listeners(ListenerReport.class)

public class My_Enquiries_serach {
	
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
				
				
				driver.findElement(By.xpath("//b[normalize-space()='My Enquiries']")).click();
				
				
				 /* Select Qualification */
			       
			       Thread.sleep(3000);	
				   
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='mycategoryFilter']")).click();
				   
				   List<WebElement> allDropDownValues =driver.findElements(By.xpath("(//option[@value='Enquiry'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownValues.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownValues.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownValues.get(i).getText());
			            
			            if(allDropDownValues.get(i).getText().contains("Enquiry"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownValues.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			               
			          }
			       
			       }
			       
			       WebElement serachenq = driver.findElement(By.name("customSearchTextField"));
			       serachenq.isDisplayed();
			       serachenq.isEnabled();
			       serachenq.sendKeys("TK38");  
		      
		          
				driver.findElement(By.xpath("//button[@id='customSearchButton']")).click();
				
				
				 /* Select Qualification */
			       
			       Thread.sleep(5000);
				   
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='mycategoryFilter']")).click();
				   
				   List<WebElement> allDropDownValuess =driver.findElements(By.xpath("(//option[@value='Student'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownValuess.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownValuess.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownValuess.get(i).getText());
			            
			            if(allDropDownValuess.get(i).getText().contains("Student"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownValuess.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			               
			          }
			       
			       }
			       
			       WebElement serachstu = driver.findElement(By.name("customSearchTextField"));
			       serachstu.isDisplayed();
			       serachstu.isEnabled();
			       serachstu.clear();
			       serachstu.sendKeys("Srinisha Jayaseelan");  
			       
		      
		          
				driver.findElement(By.xpath("//button[@id='customSearchButton']")).click();
				
				/* Select Qualification */
			       
			       Thread.sleep(5000);
				   
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='mycategoryFilter']")).click();
				   
				   List<WebElement> allDropDownValueteam =driver.findElements(By.xpath("(//option[@value='Team'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownValueteam.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownValueteam.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownValueteam.get(i).getText());
			            
			            if(allDropDownValueteam.get(i).getText().contains("Team"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownValueteam.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break; 
			               
			          }
			       
			       }
			       
			       WebElement serachteam = driver.findElement(By.name("customSearchTextField"));
			       serachteam.isDisplayed();
			       serachteam.isEnabled();
			       serachteam.clear();
			       serachteam.sendKeys("JASMINE");  
			      
		          
				driver.findElement(By.xpath("//button[@id='customSearchButton']")).click();
				
				
				driver.findElement(By.xpath("//b[normalize-space()='My Enquiries']")).click();
				
				/* Select Show filter Record  */
			       
			       Thread.sleep(5000);
				   
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='users_length']")).click();
				   
				   List<WebElement> allDropDownValuefilter =driver.findElements(By.xpath("(//option[@value='50'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownValuefilter.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownValuefilter.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownValuefilter.get(i).getText());
			            
			            if(allDropDownValuefilter.get(i).getText().contains("50"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownValuefilter.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break; 
			               
			          }
			       
			       }
			       
			       
			       Thread.sleep(5000);
			       
			     JavascriptExecutor js = (JavascriptExecutor) driver;
			     js.executeScript("window.scrollBy(0,1500)", "");
			     //to perform Scroll on application using Selenium
			       
			       //for(int i=0;i<6000;i++) {
			          //  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,0,1500)", "");
			      // }
			      
}
	
	
}
