package com.sdet.qa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumJavaQue3{

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
          actions.moveToElement(productsMenu).perform();
          // b. Click on Process Discovery
          WebElement processDiscoveryLink = driver.findElement(By.xpath("//a[contains(text(), 'Process Discovery')]"));
          processDiscoveryLink.click();
          
       // c. Verify that it's navigating to the expected URL
          String expectedUrl = "https://www.automationanywhere.com/products/process-discovery";
          String currentUrl = driver.getCurrentUrl();
          
          if (currentUrl.equals(expectedUrl)) {
              System.out.println("Navigation successful. Current URL matches the expected URL.");
          }
          
          else {
              System.out.println("Navigation failed. Current URL does not match the expected URL.");
          }
          driver.close();
		
	}
	

}
