package Web_Driver_Archi_Web_Driver_Interface;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_To_Exisiting_web_pages_In_Same_Window {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver S = new ChromeDriver();
		
		
		S.manage().window().maximize();
		
		
		S.get("https://www.shoppersstack.com/products_page/15");
		
		Thread.sleep(20000);
		
		
		S.findElement(By.name("compare")).click();
		
		Thread.sleep(10000);
		
		
		Set<String> ids = S.getWindowHandles();
		
		
		for(String D:ids ) {
			
			System.out.println(D);
			
			S.switchTo().window(D);
			
			System.out.println(S.getTitle());
		}
		
		
	//	S.quit();
		
		
		
		
		
		  
	}



}
