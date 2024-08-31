package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_new_Window {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver A = new ChromeDriver();
		
		
		A.manage().window().maximize();
		
		A.get("https://www.fireflink.com/");
		
		
		Thread.sleep(10000);
		
		
		System.out.println(A.getTitle());
		
		
		A.switchTo().newWindow(WindowType.WINDOW); // Switch to the from the one window to another new window
		
		
		System.out.println(A.getTitle());
		
		
		Thread.sleep(10000);
		
		
		A.close();
		
		
	}

}
