package Tasks;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Mths_To_fetch_All_URLS {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver Y = new ChromeDriver();
		
		
		Y.manage().window().maximize();
		
		
		Y.get("https://demowebshop.tricentis.com");
		
		
		Thread.sleep(20000);
		
		
	 List<WebElement> Total_Links = Y.findElements(By.tagName("a"));
	
	
	 System.out.println(Total_Links); //addresses of all the link elements
	 
	 
	 
	 System.out.println(Total_Links.size());  // How many link text
	 
	 
	 
	 // For the FindElements have to give the similar Locator
	 
	 // that is present in the all elements then only we can access all the things.
	 
	 
	 
	
	
	
		
	}

}
