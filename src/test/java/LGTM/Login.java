package LGTM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.ListenerReport;


@Listeners(ListenerReport.class)

public class Login { 
	
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
				
				
				driver.findElement(By.xpath("//b[normalize-space()='Add Data']")).click();
				
				
				  WebElement leadname= driver.findElement(By.name("name"));
				  leadname.isDisplayed();
				  leadname.isEnabled();
				  leadname.sendKeys("Kritika Sree");
				
				  WebElement Email= driver.findElement(By.name("email"));
				  Email.isDisplayed();
				  Email.isEnabled();
				  Email.sendKeys("kritikasree456@gmail.com");
				  
				  WebElement Mobile= driver.findElement(By.name("mobile"));
				  Mobile.isDisplayed();
				  Mobile.isEnabled();
				  Mobile.sendKeys("7075489172");
				  
				 /* Select College */
				  
				  var input = driver.findElement(By.xpath("//input[@list='colleges']"));
				  var option = driver.findElement(By.xpath("//*[@id='colleges']/option[2]"));
				  var value = option.getAttribute("value");
				  input.clear();
				  input.sendKeys(value); 
				  
				  /* Select Qualification */
			       
			       Thread.sleep(3000);	
				   
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='qualification']")).click();
					
				   
				   List<WebElement> allDropDownValues =driver.findElements(By.xpath("//option[@value='M.tech']"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownValues.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownValues.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownValues.get(i).getText());
			            
			            if(allDropDownValues.get(i).getText().contains("M.tech"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownValues.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			               
			          }
			       
			       }
			       
			       /* Select Branch */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='branch']")).click();
					
				
				   
				   List<WebElement> allDropDownbranch =driver.findElements(By.xpath("//option[@value='Computer Science']"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownbranch.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownbranch.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownbranch.get(i).getText());
			            
			            if(allDropDownbranch.get(i).getText().contains("Computer Science"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownbranch.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			               
			          }
			       
			       }  
			       
			       /* Select Passed Out Year */
			       
			       Thread.sleep(2000);	
					 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='year']")).click();
					
				
				   
				   List<WebElement> allDropDownPOY =driver.findElements(By.xpath("//option[@value='2023']"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownPOY.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownPOY.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownPOY.get(i).getText());
			            
			            if(allDropDownPOY.get(i).getText().contains("2023"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownPOY.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			               
			          }
			       
			       }  
			       
			        WebElement District = driver.findElement(By.name("dist"));
			        District.isDisplayed();
			        District.isEnabled();
			        District.sendKeys("Tirupati");
					
				    WebElement State= driver.findElement(By.name("state"));
					State.isDisplayed();
					State.isEnabled();
					State.sendKeys("Andhra Pradesh");   
			       
					driver.findElement(By.xpath("//button[@id='submit-err']")).click();
				
	}
	

}
