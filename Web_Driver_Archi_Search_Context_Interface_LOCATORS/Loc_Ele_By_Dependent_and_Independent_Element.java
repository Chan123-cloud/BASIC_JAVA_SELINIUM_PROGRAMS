package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Loc_Ele_By_Dependent_and_Independent_Element {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver T = new ChromeDriver();
		
		T.manage().window().maximize();
		
		T.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
	
		
		
		// Here I Accessed the Add to cart dependent Element by using text Independent Element
		
		T.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@type='button']")).click();
		
		
		Thread.sleep(10000);
		
		
		// Here I Accessed the Add to cart Dependent Element By using the Image Independent Element	
		
		
		T.findElement(By.xpath("//img[@title='Show details for $25 Virtual Gift Card']/../../..//input[@value='Add to cart']")).click();
	
		Thread.sleep(10000);
		
		T.close();
		
		

}
}
