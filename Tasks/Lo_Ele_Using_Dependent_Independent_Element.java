package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lo_Ele_Using_Dependent_Independent_Element {
	
	
	public static void main(String[] args) throws InterruptedException {
		
      WebDriver T = new ChromeDriver();
      
		
		T.manage().window().maximize();
		
		
		T.get("https://www.shoppersstack.com/");
		
		Thread.sleep(30000);
		
		
		
		T.findElement(By.name("loginBtn")).click();
		
		Thread.sleep(4000);
		
		
		
		
		T.findElement(By.name("Email")).sendKeys("mchandrakumarms@gmail.com");
		
		Thread.sleep(4000);
		
		
		
		
		T.findElement(By.name("Password")).sendKeys("Chandru12345@@@");
		
		Thread.sleep(4000);
		
		
		
		T.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		
		Thread.sleep(4000);

		
		
		
	   T.findElement(By.xpath("//a[@id='men']")).click();
	  
	   Thread.sleep(3000);
	   
	   
	   T.findElement(By.xpath("//a[@href='/sub-category/men-shirt']")).click();
			  
	  Thread.sleep(3000);
	  
	  
	  
	  T.findElement(By.xpath("//img[@alt='Men Regular Fit Solid Cut Away Collar Casual Shirt']/../..//button[@type='button']")).click();
	  
	  Thread.sleep(3000);
	  
	  
	  T.findElement(By.xpath("//span[text()='polo']/../..//button[@tabindex='0']")).click();
	  
	  Thread.sleep(3000);
	  
	  
	  T.close();
	  

	  
	  
		
	}

}
