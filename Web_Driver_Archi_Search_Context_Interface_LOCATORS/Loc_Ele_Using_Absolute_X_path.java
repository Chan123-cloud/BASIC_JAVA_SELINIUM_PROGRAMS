package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_Absolute_X_path {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver E = new ChromeDriver();
		
		
		E.manage().window().maximize();
		
		
		E.get("https://www.saucedemo.com/v1/ ");
		
		
		Thread.sleep(3000);
		
		
		// Here from the root we have give the path
		
		
		E.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("Chandra kumar M");
		
		
		Thread.sleep(3000);
		
		
		E.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys("Chandru12345@@@");
		
		
		Thread.sleep(3000);
		
		
		E.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]")).click();

		

		

		
		
		
	}

}
