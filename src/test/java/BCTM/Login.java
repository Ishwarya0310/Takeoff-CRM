package BCTM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	@Test(priority=1)
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
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
						username.sendKeys("JASMINE");
						
						//Provide password
						WebElement password  =  driver.findElement(By.name("password"));
						password.isDisplayed();
						password.isEnabled();
						password.sendKeys("1234");
								
						//Clicking on login button
						driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
											
						Thread.sleep(5000);
						
						Robot robot = new Robot();
						robot.delay(5000);
						robot.keyPress(KeyEvent.VK_TAB);
						robot.keyPress(KeyEvent.VK_ENTER);
						
						driver.findElement(By.xpath("//b[normalize-space()='Enquiries']")).click();
						
						Thread.sleep(5000);
						
					 	driver.findElement(By.xpath("//tbody//div[1]//div[1]//button[1]")).click(); 
						
						Thread.sleep(5000); 
					 	
						driver.findElement(By.xpath("//a[normalize-space()='Change Status']")).click(); 
						
                        Thread.sleep(3000); 
					 	
						driver.findElement(By.xpath("//div[@class='vs-radio-con vs-radio-success']//input[@id='customSwitch100']")).click(); 
					
						Thread.sleep(2000); 
						
						 WebElement BusiAmt = driver.findElement(By.name("amount"));
						 BusiAmt.isDisplayed();
						 BusiAmt.isEnabled();
						 BusiAmt.sendKeys("7000"); 
						
						//Find the date time picker control "Follow Up Date"
						 
					     WebElement dateBox = driver.findElement(By.xpath("//input[@name='date']"));

					      //Fill date as dd/mm/yyyy as 21/10/2022
					     dateBox.isDisplayed();
					     
					     dateBox.sendKeys("04/10/2023");
					     dateBox.isSelected();
					     
					 	//Find the date time picker control "Guarantee Date"
					     
					     WebElement guaranteedate = driver.findElement(By.xpath("//input[@id='guarantee-date']"));

					      //Fill date as dd/mm/yyyy as 21/10/2022
					     guaranteedate.isDisplayed();
					     
					     guaranteedate.sendKeys("04/12/2023");
					     guaranteedate.isSelected();
					     
					     
					     // Select Lead Status
					      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("//span[@role='combobox']")).click();
							
							Thread.sleep(5000);  
						   
						   List<WebElement> allDropDownValuesstate=driver.findElements(By.xpath("//li[@class='select2-results__option']"));
							 
						   
					       // Printing the amount of WebElements inside the list
					      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownValuesstate.size(); i++)
					       {
					            // Printing All the options from the dropdown
					    	    
					            System.out.println(allDropDownValuesstate.get(i).getText());
					            				            
					          //Thread.sleep(5000);  
					            
					            if(allDropDownValuesstate.get(i).getText().contains("Pending"))
					            {
					            	
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownValuesstate.get(i).click();
					            	
					              // Breaking the condition if the condition get satisfied
					                 break; 
					          }
					            
					       }
					       
					       Thread.sleep(2000);	
						//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("//select[@name='priority']")).click();
						   
						   List<WebElement> allDropDownpriority =driver.findElements(By.xpath("(//option[@value='high_priority'])[1]"));
						 //option[normalize-space()='select qualification']
						
					       // Printing the amount of WebElements inside the list
					        System.out.println("The Options in the Dropdown are: " + allDropDownpriority.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownpriority.size(); i++)
					       {
					    	  
					            // Printing All the options from the dropdown
					            System.out.println(allDropDownpriority.get(i).getText());
					            
					            if(allDropDownpriority.get(i).getText().contains("High Priority"))
					            {
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownpriority.get(i).click();
					              // Breaking the condition if the condition get satisfied
					                 break;
					          }
					       
					       }  	
					       
					       // Select Send to Department Domain
					    //    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("//span[@role='combobox']//span[@id='select2-domains_dept-container']")).click();
							
							Thread.sleep(5000);  
						   
						   List<WebElement> allDropDownValuDept =driver.findElements(By.xpath("//li[@class='select2-results__option']"));
							 
						   
					       // Printing the amount of WebElements inside the list
					      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownValuDept.size(); i++) 
					       {
					            // Printing All the options from the dropdown
					    	    
					            System.out.println(allDropDownValuDept.get(i).getText());
					            				            
					          //Thread.sleep(5000);  
					            
					            if(allDropDownValuDept.get(i).getText().contains("JAVA"))
					            {
					            	
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownValuDept.get(i).click();
					            	
					              // Breaking the condition if the condition get satisfied
					                 break;  
					          }
					            
					       }
					       
					       
					       // Select Interfacing Department 
					       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("//span[@role='combobox']//ul//li//input")).click();
							
							Thread.sleep(5000);  
						   
						   List<WebElement> allDropDownValuinter =driver.findElements(By.xpath("//li[@class='select2-results__option']"));
							 
						   
					       // Printing the amount of WebElements inside the list
					      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownValuinter.size(); i++) 
					       {
					            // Printing All the options from the dropdown
					    	    
					            System.out.println(allDropDownValuinter.get(i).getText());
					            				            
					          //Thread.sleep(5000);  
					            
					            if(allDropDownValuinter.get(i).getText().contains("AI & Machine Learning"))
					            { 
					            	
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownValuinter.get(i).click();
					            	
					              // Breaking the condition if the condition get satisfied
					                 break;  
					          }
					            
					       }
					       
					       // Select Interested Department 
					    //    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("(//span[@role='combobox'])[4]")).click();
							
							Thread.sleep(5000);    
						   
						   List<WebElement> allDropDownValuintrst = driver.findElements(By.xpath("(//li[@class='select2-results__option'])[5]"));
						   
					       // Printing the amount of WebElements inside the list 
					       System.out.println("The Options in the Dropdown are: " + allDropDownValuintrst.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownValuintrst.size(); i++) 
					       { 
					            // Printing All the options from the dropdown
					    	    
					            System.out.println(allDropDownValuintrst.get(i).getText());
					            				            
					          //Thread.sleep(5000);  
					            
					            if(allDropDownValuintrst.get(i).getText().contains("CSE"))
					            { 
					            	
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownValuintrst.get(i).click();
					            	
					              // Breaking the condition if the condition get satisfied
					                 break;  
					          }
					            
					       }  
					       
				  WebElement StudComments= driver.findElement(By.name("std_req"));
				  StudComments.isDisplayed();
				  StudComments.isEnabled();
				  StudComments.sendKeys("This Enquiry need more info about the project and titles");  
				  
				  WebElement BCComments= driver.findElement(By.name("comment"));
				  BCComments.isDisplayed();
				  BCComments.isEnabled();
				  BCComments.sendKeys("Need to assign task to EPOC regarding the titles");    
				       
	} 

}
