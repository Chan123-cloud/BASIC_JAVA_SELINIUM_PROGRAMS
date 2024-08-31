package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Loc_Ele_Using_Relative_X_Path_Any_Attributes {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver T = new EdgeDriver();
		
		T.manage().window().maximize();
		
		
		T.get("https://www.saucedemo.com/v1/");
		
		
		Thread.sleep(2000);
		
		
		T.findElement(By.xpath("//input[@type='text'][@class='form_input']")).sendKeys("chandru M");
		
		
		// We can give the Single  direct or Indirect attribute 
		
	//or 
		
		//The combination of the two or more direct and as well as Indirect Attributes  
		
		
		
  

	}

}
