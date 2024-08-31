package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Operation_by_using_different_locators {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver Y = new ChromeDriver();
		
		Y.manage().window().maximize();
		
		
		Y.get("https://demowebshop.tricentis.com/register");
		
		Thread.sleep(3000);
		
		
		
		Y.findElement(By.id("gender-male")).click();
		
		Thread.sleep(2000);
		
		
		
		Y.findElement(By.id("FirstName")).sendKeys("CHANDRA");
		
		Thread.sleep(2000);
		
		
		
		Y.findElement(By.name("LastName")).sendKeys("KUMAR M");
		
		Thread.sleep(2000);
		
		
		
		
		Y.findElement(By.name("Email")).sendKeys("mchandrakumarms@gmail.com");
		
		Thread.sleep(2000);
		
		
		
		
		Y.findElement(By.name("Password")).sendKeys("Chandru12345@@@");
		
		Thread.sleep(2000);
		
		
		
		Y.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("Chandru12345@@@");
		
		Thread.sleep(2000);
		
		
		Y.findElement(By.id("register-button")).click();
		
		
		
		
	}

}
