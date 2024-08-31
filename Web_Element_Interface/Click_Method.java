package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Y = new ChromeDriver();
		
		Y.manage().window().maximize();
		
		
		Y.get("https://www.fireflink.com/");
		
		
		Thread.sleep(30000);
		
		
		WebElement Pricing_Link = Y.findElement(By.cssSelector("[title='Pricing']"));
		
		
		Pricing_Link.click();
		
		
		Thread.sleep(3000);
		
		
		Y.close();
	}

}
