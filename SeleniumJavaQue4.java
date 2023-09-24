package com.sdet.qa;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class SeleniumJavaQue4 {

		@Test
		public void MouseOverAction() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.automationanywhere.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement AcceptAllCookies = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			AcceptAllCookies.click();
			Thread.sleep(2000);
			
			
			//initializing action class
			  Actions actions = new Actions(driver);
			  
			  // a. Do Mouse over on Products
	          WebElement productsMenu = driver.findElement(By.xpath("//a[contains(text(), 'Products')]"));
	         productsMenu.click();
	          
	          
	          WebElement RequestDemo = driver.findElement(By.xpath("//a[contains(text(), 'Request Demo')]"));
	          RequestDemo.click();
	          
	       // b. Verify that it's navigating to the expected URL
	          String expectedUrl = "https://www.automationanywhere.com/request-live-demo";
	          String currentUrl = driver.getCurrentUrl();
	          
	          if (currentUrl.equals(expectedUrl)) {
	              System.out.println("Navigation successful. Current URL matches the expected URL.");
	          }
	          
	          else {
	              System.out.println("Navigation failed. Current URL does not match the expected URL.");
	          }
	          //c.Verifying first name and lastname
	         String FName = driver.findElement(By.xpath("//label[@id='LblFirstName']")).getText();
	        String Expected_Lable= "*First Name";
	        if(FName.equals(Expected_Lable)) {
	        	System.out.println("Lable First name is verified");
	        }
	        else {
	        	System.out.println("Lable is not valid");
	        }
	        
	        
	         String LName = driver.findElement(By.xpath("//label[@id='LblLastName']")).getText();
	         System.out.println(LName);
	         
	         String LName_Lable= "*Last Name";
	         if(LName.equals(LName_Lable))
	        
	         {
		        	System.out.println("Lable Last name is verified");
	         }
		   else {
		        	System.out.println("Lable is not valid");
		        }
	          driver.close();
			
		}
		

	}



