package Web_Element_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_Mthd_Select_Copy_Paste_Keys_Operation {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver S = new ChromeDriver();
	     
			
		 S.manage().window().maximize();
			
			
		 S.get("https://www.shoppersstack.com/");
		    
			
		Thread.sleep(25000);
		
		
		S.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		Thread.sleep(4000);
		
		
		
		WebElement Email_TF = S.findElement(By.xpath("//input[@id='Email']"));
		
		
		Email_TF.sendKeys("mchandrakumarms@gmail.com");
		
		Thread.sleep(3000);
		

    	Email_TF.sendKeys(Keys.CONTROL+"A");
		
		Thread.sleep(3000);
		
		
		Email_TF.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(3000);

		
	   WebElement Search_TF = S.findElement(By.xpath("//input[@id='Password']"));

		Thread.sleep(3000);

		
	   Search_TF.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(3000);
		
		
	  S.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd'")).click();
	
	  Thread.sleep(3000);
	
	  
	  S.close();
	

	
	
	
		
		


			
			
			
			
			
	
			

			
			
	}

	}


