package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_By_Static_and_Dynamic_Element {
	
	
	public static void main(String[] args) throws InterruptedException {
		
       WebDriver T = new ChromeDriver();
		
		T.manage().window().maximize();
		
		T.get("https://omayo.blogspot.com/");
		
		Thread.sleep(5000);
		
		
		//Static Element --->Independent Element
		
		
		//Dynamic Element ----> Dependent Elemewnt
		
		
		
	 // Here I Accessed the 25 text Dynamic Element by using Name Text Static Element
		
//	T.findElement(By.xpath("//td[text()='Manish']/..//td[text()='25']")).getText();
	
//	 Thread.sleep(10000);
	 
	// Here I Accessed the Banglore text Dynamic Element by using Name Text Static Element
	
	
	T.findElement(By.xpath("//td[text()='Praveen']/..//td[text()='Banglore']")).getText();
	
	Thread.sleep(3000);
	
	
	
	// Get Text Wil get the text from the Dynmaic Elements that we are Accessed.
	
	
	T.close();

	

	
		
	}

}
