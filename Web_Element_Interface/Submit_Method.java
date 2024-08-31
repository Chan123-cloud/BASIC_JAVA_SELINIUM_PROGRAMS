package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Method {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
       WebDriver U = new ChromeDriver();
		
		
		U.manage().window().maximize();
		
		
		U.get("https://www.shoppersstack.com/");
		
		
		Thread.sleep(25000);
		
		
		
		U.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		Thread.sleep(4000);
		
		
		U.findElement(By.xpath("//button[@id='Login']")).submit();
		
		
		//    Conditions to Satisfy
		
		//  ------>  type = submit (Locators)
		
		//  ------->  1 st condition ANV pair should be in the <form> tag
		
		//  If Both the conditions are satisfied we can use the submit method only for clicking
		
		//  Click method can use anywhere for clicking the button.
		
		
		
		
		
		
		
		
		
		
		
	}

}
