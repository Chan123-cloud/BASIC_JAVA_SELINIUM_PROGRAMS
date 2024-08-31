package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_For_Radio_Button {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		  WebDriver Q = new ChromeDriver();
			
			
			Q.manage().window().maximize();
			
			
			Q.get("https://demowebshop.tricentis.com/register");
			
			
			Thread.sleep(20000);
			
			
			WebElement Radio_Btn = Q.findElement(By.cssSelector("[id='gender-male'"));
			
			
			boolean H = Radio_Btn.isSelected();
			
			if(H) {
				
				System.out.println("THE RADIO BUTTON IS SELECTED");
			}
			
			else {
				
				
			}
			
			
			System.out.println("THE RADIO BUTTON IS NOT SELECTED");
			
			Radio_Btn.click();
			
			System.out.println("AFTER RADIO BUTTON WAS CLICKED THE RADIO BUTTON WAS SELECTED");
		
	}

}
