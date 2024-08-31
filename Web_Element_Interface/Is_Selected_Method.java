package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_Method {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
     WebDriver Q = new ChromeDriver();
		
		
		Q.manage().window().maximize();
		
		
		Q.get("https://demowebshop.tricentis.com/login");
		
		
		Thread.sleep(25000);
		
		
		 WebElement Check_Box = Q.findElement(By.cssSelector("input[id='RememberMe']"));
		
		
		boolean B = Check_Box.isSelected();  // false ----> Else part will execute
		
		
		if(B) {
			
			System.out.println("THE CHECK BOX IS SELECTED");
		}
		
		
		else {
			
			System.out.println("THE CHECK BOX IS NOT SELECTED");
			
			
			Check_Box.click();
			
			
			System.out.println("THe CHECK BOX WAS SELECTED AFTER IT WAS CLICKED");
		}
		
		
	
	}

}
