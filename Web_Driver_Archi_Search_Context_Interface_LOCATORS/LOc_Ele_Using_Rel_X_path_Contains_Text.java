package Web_Driver_Archi_Search_Context_Interface_LOCATORS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LOc_Ele_Using_Rel_X_path_Contains_Text {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver Y = new ChromeDriver();
		
		Y.manage().window().maximize();
		
		Y.get("https://www.shoppersstack.com/user-signin");
		
		Thread.sleep(20000);
		
		Y.findElement(By.xpath("//a[contains(text(),'Forgot Pass')]")).click();
		
		
		// Normally we will go for the contains when there is a lengthy link text or normal text
			
		// Here we are checking wheather the text() is containing the Actual text or not
		
		// So we shall give the text Partially or fully.
		
		
		
}
	
}
