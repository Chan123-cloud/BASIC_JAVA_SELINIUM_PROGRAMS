package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Ele_Using_Rel_X_path_any_Using_Indexes {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver Y = new ChromeDriver();
		
	 Y.manage().window().maximize();
		
	 Y.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		
		Y.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[3]")).click();
		
		Thread.sleep(3000);
		
		Y.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[4]")).click();
		
		
		
		// Here I have done clicking operation for the different jewwlery text by using the Indexes.
		
		
		// These Indexes are applicable to normal attributes and text and contains attibutes and the text
		
		
		// When we are giving the Indexes to find the locator of the Element
		
		
		// We should enclose the entire Syntax with () and give the [index value] 
		
		
		
	}

}
