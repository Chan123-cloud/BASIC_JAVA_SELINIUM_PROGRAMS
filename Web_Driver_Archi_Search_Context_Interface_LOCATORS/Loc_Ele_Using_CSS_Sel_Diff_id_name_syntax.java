package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_CSS_Sel_Diff_id_name_syntax {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver Y = new ChromeDriver();
	
	
	Y.manage().window().maximize();
	
	
	Y.get("https://demowebshop.tricentis.com/login");
	
	
	Thread.sleep(3000);
	
	
	
	// These four syntxes is for the id and as well as name
	
	
	
	
    // first syntax 
	
	
   	Y.findElement(By.cssSelector("[id='Email'")).sendKeys("mchandrakumarms@gmail.com");
	
	
	// second syntax
	
	
    //   Y.findElement(By.cssSelector("input[id='Email'")).sendKeys("mchandrakumarms@gmail.com");
	
	
	//Third Syntax
	
	
   //	Y.findElement(By.cssSelector("input#Email")).sendKeys("mchandrakumarms@gmail.com");
	
	
	
    // fourth syntax
	
	
//	Y.findElement(By.cssSelector("#Email")).sendKeys("mchandrakumarms@gmail.com");

	
		
	}
}
