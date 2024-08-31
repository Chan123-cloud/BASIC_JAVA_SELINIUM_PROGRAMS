package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Id__And_Send_Keys {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver T = new ChromeDriver();
		
		
		T.manage().window().maximize();
		
		
		T.get("https://www.flipkart.com/");
		
		
		Thread.sleep(5000);
		
		
		T.findElement(By.className("Pke_EE")).sendKeys("HOODIES");
		
		
		Thread.sleep(2000);
		
		
		T.findElement(By.cssSelector("svg[width='24']")).click();
		
		
		Thread.sleep(2000);
		
		
		T.quit();
		
		
	
		
	}
}

