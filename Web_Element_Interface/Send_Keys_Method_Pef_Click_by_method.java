package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_Method_Pef_Click_by_method {
	
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver Y = new ChromeDriver();
        
		
		Y.manage().window().maximize();
		
		
		Y.get("https://demowebshop.tricentis.com/");
		
		
		Thread.sleep(10000);
		
		 WebElement Search_TextField = Y.findElement(By.cssSelector("[autocomplete='off']"));
		 
		 
		 
		 // Send Keys Method
		
		
	//	 Search_TextField.sendKeys("Books");  //-----> As a string we are passing the values in the Sendkeys
		 
		 
		Search_TextField.sendKeys("B","o","o","k","s");  //------> As a Char Sequence we are passing the values in the Sendkeys
		
		
		Thread.sleep(4000);
		
		
		// click Method
		
		
		 WebElement Search_Btn = Y.findElement(By.cssSelector(".button-1.search-box-button"));
		
		
		 Search_Btn.click();    //-------->One Way to perform the Click Action
		

		 
		 
		 
		
		
		
		
		
	}

}
