package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Page_Source {
	
	public static void main(String[] args) {
		
		FirefoxDriver Q = new FirefoxDriver();  // Launching the Browser
		
		
	 Q.get("https://www.fireflink.com/");    // Navigating to the specific web page
	
	
	
	String S =Q.getPageSource();
	
	System.out.println(S);
	
	
	
	
	
	System.out.println(Q.getPageSource());  // Get the source code  
	
	
	//-----> which means of the Particular web page is developed by the piece of code
	
	
	Q.close();  // Closing the Browser
		
	}

}
