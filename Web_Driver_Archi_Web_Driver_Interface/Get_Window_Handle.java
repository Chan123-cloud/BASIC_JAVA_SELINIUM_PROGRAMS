package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Q = new ChromeDriver();
		
		
		Q.manage().window().maximize();
		
		
		Q.get("https://web.whatsapp.com/");
		
		
		String D = Q.getWindowHandle();   // To get the parent web page of apk id
		
		
		
		System.out.println(D);
		
		
		Thread.sleep(3000);
		
		
		Q.close();
		
	}

}
