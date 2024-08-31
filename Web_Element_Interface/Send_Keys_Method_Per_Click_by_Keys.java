package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_Method_Per_Click_by_Keys {
	
	public static void main(String[] args) throws InterruptedException {
	
	
	     WebDriver Y = new ChromeDriver();
      
		
			Y.manage().window().maximize();
			
			
			Y.get("https://demowebshop.tricentis.com/");
			
			
			Thread.sleep(10000);
			
			 WebElement Search_TextField = Y.findElement(By.cssSelector("[autocomplete='off']"));
			 
			 
			 
			 // Send Keys Method
			
			
	//	 Search_TextField.sendKeys("Books",Keys.ENTER);  //-----> As a string we are passing the values in the Sendkeys
			 
			 
		Search_TextField.sendKeys("B","o","o","k","s", Keys.ENTER);  //------> As a Char Sequence we are passing the values in the Sendkeys
			
			
			
			// Here Instead of going to the Click action we are performing enter action ------->2 way
			
			
			
			Thread.sleep(4000);
			
			
			Y.close();
			
			
			

}
}
