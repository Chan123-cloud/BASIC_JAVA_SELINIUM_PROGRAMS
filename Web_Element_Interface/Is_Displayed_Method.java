package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Method {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		  WebDriver Y = new ChromeDriver();
	        
			
			Y.manage().window().maximize();
			
			
			Y.get("https://demowebshop.tricentis.com/login");
			
			
			Thread.sleep(10000);
			
			

			Thread.sleep(3000);
			
			
		
			Y.findElement(By.cssSelector("input[class='email'][type='text']")).sendKeys("mchandrakumarms@gmail.com");
			
			
			
			// Here In the CSS Selectors I have used the two different AN &AV.
			
			
			Thread.sleep(3000);
			
			
			Y.findElement(By.className("password")).sendKeys("Chandru12345@@@");
			
			
			Thread.sleep(3000);
			
			
			Y.findElement(By.id("RememberMe")).click();
			
			
			Thread.sleep(3000);
			
			
			Y.findElement(By.xpath("//input[@type='submit'][@class='button-1 login-button']")).click();
			
			
			
			//IS Displayed Operation  ----> For Retruning the True
			
			
		WebElement RESULT = Y.findElement(By.xpath("//a[text()='Log out']"));
			
			
		   boolean W =   RESULT.isDisplayed();   // Result is True Here
		   
		   
		   if(W) {
			   
			   System.out.println("SUCCESSFULLY LOGGED IN");
		   }
		   
		   else {
			   
			   System.out.println("UR BAD NOT LOGGED IN");
		   }  
		   
		   
			//IS Displayed Operation  ----> For Retruning the False
		   
		   
		/*	WebElement RESULT_1= Y.findElement(By.xpath("//a[text()='Log in']"));
			
			
			   boolean V =   RESULT_1.isDisplayed();
			   
			   
			   if(V) {
				   
				   System.out.println("SUCCESSFULLY LOGGED IN");
			   }
			   
			   */
			   
			  
			
		
	}

}
