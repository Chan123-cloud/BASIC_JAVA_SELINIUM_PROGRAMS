package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_And_Keys_Operation_For_Login {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver R = new ChromeDriver();
		
		R.manage().window().maximize();
		
		R.get("https://demowebshop.tricentis.com/login");
		
		
		Thread.sleep(4000);
		
		
		
	// WebElement Email = R.findElement(By.name("Email"));
	
	
	//  Email.sendKeys("mchandrakumarms@gmail.com");
	  
	  
	  // OR
	  
	  
	  
	   R.findElement(By.name("Email")).sendKeys("mchandrakumarms@gmail.com");
		
	
	
	  Thread.sleep(4000);
	  
	  
	  
	
	//  WebElement Password = R.findElement(By.className("password"));
	   
	   
	//   Password.sendKeys("Chandru12345@@@",Keys.ENTER);
	   
	   
	   //OR
	   
	   
	   R.findElement(By.className("password")).sendKeys("Chandru12345@@@",Keys.ENTER);
	   
	   
	   Thread.sleep(5000);
	   
	   
	   R.close();
	   
	   

	
	
	
	}

}
