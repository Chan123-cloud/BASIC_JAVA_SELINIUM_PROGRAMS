package Web_Driver_Archi_Web_Driver_Interface;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_To_Exsisting_Two_Diff_Window {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver T = new ChromeDriver();
		
		
		T.manage().window().maximize();
		
		
		T.get("https://www.fireflink.com/");
		
		
		Thread.sleep(10000);
		
		
		T.switchTo().newWindow(WindowType.WINDOW); // Switch to the new window
		
	
		Thread.sleep(4000);
		
		
		T.get("https://www.shoppersstack.com/");
		
		
		Thread.sleep(20000);
		
		
		Set<String> ids = T.getWindowHandles();  // Getting the both the old and as well as new Window IDS
		
		
		System.out.println(ids);
		
		
		for(String F : ids) {   // Acesssing the all IDS Individually
			
			
			System.out.println(F);
			
			T.switchTo().window(F);   // To navigate to the each web pages that is in the same window or the diff window Individually.
			
			                          // Accepts only one id at a time.
			
			                          // To locate the Elements on the each web pages present in the  same or different window.
			
			Thread.sleep(10000);
			
			System.out.println(T.getTitle());
		
		
	}
		
		T.quit();

}
}
