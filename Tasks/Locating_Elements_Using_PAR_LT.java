package Tasks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Elements_Using_PAR_LT {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver W = new ChromeDriver();
		
		
		W.manage().window().maximize();
		
		
		W.get("https://www.shoppersstack.com/");
		
		Thread.sleep(20000);
		
		W.findElement(By.partialLinkText("ELECTRONIC")).click();
		
		
		// Here due to the case sensitive I have given the web page element name as the input of partial link text
		
		Thread.sleep(4000);
		
		System.out.println(W.getTitle());
		
		
		
		
		
		
		
		
		
		
		
	}

}
