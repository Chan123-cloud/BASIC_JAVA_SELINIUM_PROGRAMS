package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Operation_Using_Different_Locators {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriver H = new ChromeDriver();
     
		
	  H.manage().window().maximize();
		
		
	    H.get("https://demowebshop.tricentis.com/login");
	    
		
		Thread.sleep(3000);
		
		
	
		H.findElement(By.cssSelector("input[class='email'][type='text']")).sendKeys("mchandrakumarms@gmail.com");
		
		
		
		// Here In the CSS Selectors I have used the two different AN &AV.
		
		
		Thread.sleep(3000);
		
		
		H.findElement(By.className("password")).sendKeys("Chandru12345@@@");
		
		
		Thread.sleep(3000);
		
		
		H.findElement(By.id("RememberMe")).click();
		
		
		Thread.sleep(3000);
		
		
		H.findElement(By.xpath("//input[@type='submit'][@class='button-1 login-button']")).click();
		
		
	
		
		
		
		
		 
		
		
		
		
		
		
	}

}
