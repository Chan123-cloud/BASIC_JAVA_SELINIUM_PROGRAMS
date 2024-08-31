package Web_Driver_Archi_Web_Driver_Interface;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handles {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver A = new ChromeDriver();
		
		
		A.manage().window().maximize();
		
		
		A.get("https://www.shoppersstack.com/products_page/17");
		
		Thread.sleep(250000);
		
		A.findElement(By.id("compare")).click();
		
		Thread.sleep(20000);
		
		
		String S = A.getWindowHandle(); // To get the parent web page of apk id
		
		
		System.out.println(S);
		
		
		Set<String> IDS = A.getWindowHandles();  // To get the all web pages ids (Both the parent and child web pages ids)
		
		
		System.out.println(IDS);
		
		
		Thread.sleep(4000);
		
		
	//	A.quit();
		
		
		
		
	}

}
