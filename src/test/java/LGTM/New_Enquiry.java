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

public class New_Enquiry {
	
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
				
				
				driver.findElement(By.xpath("//a[contains(@href,'https://crm.php.ymtsindia.org/new-enquiry-sales')]")).click();
				
				
		          WebElement leadname= driver.findElement(By.name("name"));
				  leadname.isDisplayed();
				  leadname.isEnabled();
				  leadname.sendKeys("Karthiga");
				  
				  WebElement Mobile= driver.findElement(By.name("phone_number"));
				  Mobile.isDisplayed();
				  Mobile.isEnabled();
				  Mobile.sendKeys("7075629172"); 
				
				  WebElement Email= driver.findElement(By.name("email"));
				  Email.isDisplayed();
				  Email.isEnabled();
				  Email.sendKeys("karthigasree45@gmail.com");
				
				  WebElement AltMobile= driver.findElement(By.name("alternative_num"));
				  AltMobile.isDisplayed();
				  AltMobile.isEnabled();
				  AltMobile.sendKeys("9701978986"); 
				  
				 /* Select College */
				  
				  var input = driver.findElement(By.xpath("//input[@list='colleges']"));
				  var option = driver.findElement(By.xpath("//*[@id='colleges']/option[10]"));
				  var value = option.getAttribute("value");
				  input.clear();
				  input.sendKeys(value); 
				  
				  
					 /* Select University */
					  
					  var input1 = driver.findElement(By.xpath("//input[@list='universitys']"));
					  var option1 = driver.findElement(By.xpath("//*[@id='universitys']/option[9]"));
					  var value1 = option1.getAttribute("value");
					  input1.clear();
					  input1.sendKeys(value1); 	  
					  
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
				  
				       /* Select Country */
				       
				       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						driver.findElement(By.xpath("//span[@role='combobox']")).click();
						
						//Thread.sleep(5000);
					   
					   List<WebElement> allDropDownValuescountry=driver.findElements(By.xpath("//li[@class='select2-results__option']"));
						 
					   
					   //* [contains(text(),'India')]
				       // Printing the amount of WebElements inside the list
				        System.out.println("The Options in the Dropdown are: " + allDropDownValuescountry.size());

				       // Condition to get the WebElement for list
				       for(int i=0; i<allDropDownValuescountry.size(); i++)
				       {
				            // Printing All the options from the dropdown
				    	    
				          //  System.out.println(allDropDownValuescountry.get(i).getText());
				            				            
				            if(allDropDownValuescountry.get(i).getText().contains("Canada"))
				            {
				            	
				                 // Clicking if text "Checkbox Demo" is there
				            	allDropDownValuescountry.get(i).click();
				            	
				              // Breaking the condition if the condition get satisfied
				                 break;
				          }
				            
				       }   
				       
				       
				       Thread.sleep(5000);
				       
                    /* Select State */
				       
				      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						driver.findElement(By.xpath("//span[@role='combobox']//span[@id='select2-state-container']")).click();
						
						Thread.sleep(5000);
					   
					   List<WebElement> allDropDownValuesstate=driver.findElements(By.xpath("//li[@class='select2-results__option']"));
						 
					   
				       // Printing the amount of WebElements inside the list
				      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

				       // Condition to get the WebElement for list
				       for(int i=0; i<allDropDownValuesstate.size(); i++)
				       {
				            // Printing All the options from the dropdown
				    	    
				           // System.out.println(allDropDownValuesstate.get(i).getText());
				            				            
				          //Thread.sleep(5000);  
				            
				            if(allDropDownValuesstate.get(i).getText().contains("Ontario"))
				            {
				            	
				                 // Clicking if text "Checkbox Demo" is there
				            	allDropDownValuesstate.get(i).click();
				            	
				              // Breaking the condition if the condition get satisfied
				                 break;
				          }
				            
				       }   
				       
				       Thread.sleep(5000);
				       
				       /* Select City */
				       
					      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							driver.findElement(By.xpath("//span[@role='combobox']//span[@id='select2-city-container']")).click();
							
							Thread.sleep(5000);
						   
						   List<WebElement> allDropDownValuescity=driver.findElements(By.xpath("//li[@class='select2-results__option']"));
							 
						   
					       // Printing the amount of WebElements inside the list
					      //  System.out.println("The Options in the Dropdown are: " + allDropDownValuesstate.size());

					       // Condition to get the WebElement for list
					       for(int i=0; i<allDropDownValuescity.size(); i++)
					       {
					            // Printing All the options from the dropdown
					    	    
					           // System.out.println(allDropDownValuesstate.get(i).getText());
					            				            
					         // Thread.sleep(5000);  
					            
					            if(allDropDownValuescity.get(i).getText().contains("Mattawa"))
					            {
					            	
					                 // Clicking if text "Checkbox Demo" is there
					            	allDropDownValuescity.get(i).click();
					            	
					              // Breaking the condition if the condition get satisfied
					                 break;
					          }
					            
					       }   
					      
					   	//Clicking on Qualification Tab/Feature
					       
						driver.findElement(By.xpath("//a[@id='account-pill-password']")).click();
				       
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
			       
			       /* Select Specilization */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='sub_qualification']")).click();
					
				
				   
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
			       
		               /* Select Department */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='department']")).click();
					
				
				   
				   List<WebElement> allDropDowndept =driver.findElements(By.xpath("(//option[@value='41'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDowndept.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDowndept.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDowndept.get(i).getText());
			            
			            if(allDropDowndept.get(i).getText().contains("CSE"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDowndept.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			          }
			       
			       }  
			       
			     
            /* Select Service Type */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@id='d_type']")).click();
					
				
				   
				   List<WebElement> allDropDownservice =driver.findElements(By.xpath("(//option[@value='project'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownservice.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownservice.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownservice.get(i).getText());
			            
			            if(allDropDownservice.get(i).getText().contains("Project"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownservice.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			          }
			       
			       }  
			       
            /* Select Domain */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='domain']")).click();
					
					   
				   List<WebElement> allDropDownDomain =driver.findElements(By.xpath("(//option[@value='Java'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownDomain.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownDomain.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownDomain.get(i).getText());
			            
			            if(allDropDownDomain.get(i).getText().contains("Java"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownDomain.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			          }
			       
			       }
			       
			       
           /* Select Services */
			       
			       Thread.sleep(2000);	
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					driver.findElement(By.xpath("//select[@name='service']")).click();
					
					   
				   List<WebElement> allDropDownservks =driver.findElements(By.xpath("(//option[@value='Major Project'])[1]"));
				 //option[normalize-space()='select qualification']
				
			       // Printing the amount of WebElements inside the list
			        System.out.println("The Options in the Dropdown are: " + allDropDownservks.size());

			       // Condition to get the WebElement for list
			       for(int i=0; i<allDropDownservks.size(); i++)
			       {
			    	  
			            // Printing All the options from the dropdown
			            System.out.println(allDropDownservks.get(i).getText());
			            
			            if(allDropDownservks.get(i).getText().contains("Major Project"))
			            {
			                 // Clicking if text "Checkbox Demo" is there
			            	allDropDownservks.get(i).click();
			              // Breaking the condition if the condition get satisfied
			                 break;
			          }
			       
			       }  
			       
			     //Clicking on Enquiry Status Tab/feature
			       
					driver.findElement(By.xpath("//a[@id='account-pill-info']")).click();
			       
					  /* Select Source */
				       
				       Thread.sleep(2000);	
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						driver.findElement(By.xpath("//select[@id='source']")).click();
					   
					   List<WebElement> allDropDownsource =driver.findElements(By.xpath("(//option[@value='YouTube'])[1]"));
					 //option[normalize-space()='select qualification']
					
				       // Printing the amount of WebElements inside the list
				        System.out.println("The Options in the Dropdown are: " + allDropDownsource.size());

				       // Condition to get the WebElement for list
				       for(int i=0; i<allDropDownsource.size(); i++)
				       {
				    	  
				            // Printing All the options from the dropdown
				            System.out.println(allDropDownsource.get(i).getText());
				            
				            if(allDropDownsource.get(i).getText().contains("YouTube"))
				            {
				                 // Clicking if text "Checkbox Demo" is there
				            	allDropDownsource.get(i).click();
				              // Breaking the condition if the condition get satisfied
				                 break;
				          }
				       
				       }  	
				       
                   /* Select Priority */
				       
				       Thread.sleep(2000);	
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						driver.findElement(By.xpath("//select[@id='enq_priority']")).click();
					   
					   List<WebElement> allDropDownpriority =driver.findElements(By.xpath("(//option[@value='High'])[1]"));
					 //option[normalize-space()='select qualification']
					
				       // Printing the amount of WebElements inside the list
				        System.out.println("The Options in the Dropdown are: " + allDropDownpriority.size());

				       // Condition to get the WebElement for list
				       for(int i=0; i<allDropDownpriority.size(); i++)
				       {
				    	  
				            // Printing All the options from the dropdown
				            System.out.println(allDropDownpriority.get(i).getText());
				            
				            if(allDropDownpriority.get(i).getText().contains("High"))
				            {
				                 // Clicking if text "Checkbox Demo" is there
				            	allDropDownpriority.get(i).click();
				              // Breaking the condition if the condition get satisfied
				                 break;
				          }
				       
				       }  	
				       	
				    WebElement Comments= driver.findElement(By.name("comments"));
				    Comments.isDisplayed();
				    Comments.isEnabled();
				    Comments.sendKeys("This Enquiry need more info about the project and titles");   
			       
					driver.findElement(By.xpath("//button[@id='submit-err']")).click(); 

	} 
	

}
