package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver U = new ChromeDriver();
		
		
		U.manage().window().maximize();
		
		
		U.get("https://demowebshop.tricentis.com/login");
		
		
		Thread.sleep(10000);
		
		
		
		WebElement Email = U.findElement(By.id("Email"));
		
		
		System.out.println("BEFORE ENTERING THE DATA"+Email.getAttribute("id"));
		
		
		// we will pass the Attribute name then we will get the Attribute value
		
		//It is Generally
		
		
		Thread.sleep(10000);
		
		
		
		WebElement Email_1 = U.findElement(By.id("Email"));

		
		Email_1.sendKeys("mchandrakumarms@gmail.com");
		
		
	
		
		System.out.println("AFTER ENTERING THE DATA"+Email_1.getAttribute("value"));
		
		
		
		// we will pass the value as a paramter (ATTRIBUTE NAME) then we get data that we have passed to the Element 
		
		
		// Not only for the Text Field element 
		
		
		// If we want to retrun back the data that we have passed in any Element use VALUE as Parameter



	
		
	
	}

}
