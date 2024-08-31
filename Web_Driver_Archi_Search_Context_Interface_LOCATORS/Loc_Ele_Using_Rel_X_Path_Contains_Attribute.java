package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_Rel_X_Path_Contains_Attribute {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver Y = new ChromeDriver();
		
		Y.manage().window().maximize();
		
		Y.get("https://www.shoppersstack.com/user-signin");
		
		Thread.sleep(20000);
		
		Y.findElement(By.xpath("//input[contains(@aria-invalid,'false')]")).sendKeys("hello");
		
		
		// Normally we will go for the contains when there is a lengthy direct and as well as Indirect Attributes
			
		// Here we are checking wheather the AN is containing the AV
		
		// So we shall give the AV Partially or fully.
		
	}

}
