package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_to_Multiple_ele_By_Loc_1_Ele_LOGIN {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver H = new ChromeDriver();
		     
			
		  H.manage().window().maximize();
			
			
		    H.get("https://demowebshop.tricentis.com/login");
		    
			
			Thread.sleep(3000);
			
			
			
			
			
			// Here Instead of locating password text field 
			
			
			//I am used the TAB keys to move cursor from email text field to the password text field
			
			
			// And the send password credentials and perform click action by ENTER keys
			
			
		
			H.findElement(By.cssSelector("input[class='email'][type='text']"))
			
			.sendKeys("mchandrakumarms@gmail.com",Keys.TAB,"Chandru12345@@@",Keys.ENTER);
			
	}

}
