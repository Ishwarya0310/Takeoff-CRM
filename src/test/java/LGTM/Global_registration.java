package LGTM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.ListenerReport;


@Listeners(ListenerReport.class)

public class Global_registration { 
	
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
				
				
				DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("browser", "Chrome");
			    caps.setCapability("browser_version", "111.0.5563.147");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("os_version", "10");

			    // INIT CHROME OPTIONS
			    ChromeOptions options = new ChromeOptions();
			    Map<String, Object> prefs = new HashMap<String, Object>();
			    Map<String, Object> profile = new HashMap<String, Object>();
			    Map<String, Object> contentSettings = new HashMap<String, Object>();

			    // SET CHROME OPTIONS
			    // 0 - Default, 1 - Allow, 2 - Block
			    contentSettings.put("notifications", 1);
			    profile.put("managed_default_content_settings", contentSettings);
			    prefs.put("profile", profile);
			    options.setExperimentalOption("prefs", prefs);

			    // SET CAPABILITY
			    caps.setCapability(ChromeOptions.CAPABILITY, options);

			    WebDriver drivers = new RemoteWebDriver(caps);

			    drivers.get("https://crm.php.ymtsindia.org/sales-tm");
			    drivers.findElement(By.xpath("//body/main[1]/p[3]/input[1]")).click();
			    Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("//b[normalize-space()='Global Registration']")).click();
				
				
				//Find the date time picker control "From Date"
				 
		        WebElement dateBox = driver.findElement(By.xpath("//input[@id='from']"));

		        //Fill date as dd/mm/yyyy as 21/10/2022
		        dateBox.isDisplayed();
		     
		        dateBox.sendKeys("04/06/2023");
		        dateBox.isSelected(); 
		        
		        //Find the date time picker control "To Date"
				 
		        WebElement todate = driver.findElement(By.xpath("//input[@id='to']"));

		        //Fill date as dd/mm/yyyy as 21/10/2022
		        todate.isDisplayed();
		     
		        todate.sendKeys("04/06/2023");
		        todate.isSelected();
		      
		        // Select Department
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//span[@role='combobox']")).click();
				
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
		            
		            if(allDropDownValuesstate.get(i).getText().contains("CSE"))
		            {
		            	
		                 // Clicking if text "Checkbox Demo" is there
		            	allDropDownValuesstate.get(i).click();
		            	
		              // Breaking the condition if the condition get satisfied
		                 break;
		          }
		            
		       }   
		         
				driver.findElement(By.xpath("//div[@class='inputBox']//button[@value='Search']")).click();	
	}
	
}
