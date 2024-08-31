package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_Rel_X_path_OR_Logical_Operator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		   WebDriver Y = new ChromeDriver();
			
			Y.manage().window().maximize();
			
			
			
			Y.get("https://www.shoppersstack.com/");
			
			Thread.sleep(30000);
			
			
			
			
			Y.findElement(By.id("loginBtn")).click();
			
			Thread.sleep(2000);
			
			
			
			
	        Y.findElement(By.name("Email")).sendKeys("mchandrakumarms@gmail.com");
			
			Thread.sleep(2000);
			
			
			
			
	    	Y.findElement(By.id("Password")).sendKeys("Chandru12345@@@");
	    	
	    	
				Thread.sleep(2000);
				
				
				
			Y.findElement(By.id("Login")).click();
					
					Thread.sleep(10000);
					
						
			
			
			// Then we are Performing the or operations.
					
					
		Y.findElement(By.xpath("//a[@id='men' or text()='Men']")).click();
		
	
		Thread.sleep(2000);
		
		
	   Y.findElement(By.xpath("//input[@id='search' or @list='browsers']")).click();
		
		
	   Thread.sleep(2000);
	
	
	   Y.close();
			
					
					
			
		
	}

}
