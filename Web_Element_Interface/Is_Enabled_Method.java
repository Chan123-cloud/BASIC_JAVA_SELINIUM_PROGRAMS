package Web_Element_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Q = new ChromeDriver();
		
		
		Q.manage().window().maximize();
		
		
		Q.get("https://www.shoppersstack.com/");
		
		
		Thread.sleep(25000);
		
		
		WebElement Button = Q.findElement(By.xpath("//button[@name='loginBtn']"));
		
		
       boolean E = Button.isEnabled();  // RETURN TRUE
       
       
       if(E) {
    	   
    	   System.out.println("IT IS CLICKABLE");
    	   
    	   Button.click();
    	  
       }
       
       else {
    	   
    	   System.out.println("IT IS NOT CLICKABLE");
    	   
       }
		
	}

}
