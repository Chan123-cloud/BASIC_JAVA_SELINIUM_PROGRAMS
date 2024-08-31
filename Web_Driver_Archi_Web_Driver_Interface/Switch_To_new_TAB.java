package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_new_TAB {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver W = new ChromeDriver();
		
		
		W.manage().window().maximize();
		
		
		W.get("https://www.fireflink.com/");
		
		Thread.sleep(4000);
		
		W.switchTo().newWindow(WindowType.TAB);  //Switch to the new tab in the same window
		
		Thread.sleep(4000);
		
		W.quit();
		
	}

}
