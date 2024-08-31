package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Close {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	InternetExplorerDriver W = new InternetExplorerDriver();
		
		Thread.sleep(5000);
		
		W.close();
		
		
		
		
		
		ChromeDriver  R = new ChromeDriver();
		
		R.get("https://www.fireflink.com/");
		
		Thread.sleep(3000);
		
		R.close();  // It will close only the Mian window not the Child window
		
		
		
		
		//Accessing the element in the web page
		

        ChromeDriver  I= new ChromeDriver();
        
		
		I.get("https://www.google.com/search?q=vijay&oq=vijay&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIKCAEQLhixAxiABDIKCAIQLhixAxiABDIMCAMQIxgnGIAEGIoFMgoIBBAuGLEDGIAEMgoIBRAuGLEDGIAEMgoIBhAuGLEDGIAEMgoIBxAuGLEDGIAEMg0ICBAAGIMBGLEDGIAEMgcICRAAGIAE0gEJNDI3M2owajE1qAIIsAIB&sourceid=chrome&ie=UTF-8#wptab=si:ACC90nyR35EXIVqsrAONouAC2If7im8eG9AWdkeY7WEHZ67Ix7Ugt7hDFlfhUy8u680d9j9r1rd3TC1SRFy49ueuqnei4aKpMbRwe3CsZtYvLY2peUwx_4Snw9DMPuec8iLfptPz6jFr");
		
		Thread.sleep(15000);
		
		I.findElement(By.className("REySof T9jMmf"));
		
		Thread.sleep(10000);
		
		I.close();
		
		
		
		// close ---> It will close only the main window.
		
		// Quit ----> It will close the main Window as well as the Child window.
		
		
		
		
		
	}

}
