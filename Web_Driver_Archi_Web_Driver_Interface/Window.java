package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver T = new ChromeDriver();
		
		
		
	/*	T.manage().window().maximize();
		
		Thread.sleep(3000);*/
		
		
		
		
		
		T.get("https://www.fireflink.com/");
		
		Thread.sleep(3000);
		
		
		
		
		
	/*T.manage().window().fullscreen();
		
		Thread.sleep(3000);*/
		
		
		
		
		
		
		T.manage().window().minimize();
		
		 
		Thread.sleep(3000);
		
		
		
		
		
		
		Dimension Size= T.manage().window().getSize();
		
		
		System.out.println(Size);
		
		
		
		
		// Specifically If we want to get the Height and the Width of this things 
		
		
		int a = T.manage().window().getSize().getHeight();
		
		
		System.out.println(a);
		
		
		int b = T.manage().window().getSize().getWidth();
		
		
		System.out.println(b);
		
		
		
		
		
		T.close();
		
		
	}

}
