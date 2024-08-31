package Web_Driver_Archi_Web_Driver_Interface;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {
	
          public static void main(String[] args) {
        	  
        	  ChromeDriver A = new ChromeDriver();
        	  
        	  A.get("https://www.fireflink.com/");  // This is one way to get that web page
        	  
        	  
        	  
        	  // Using get method we can Navigate to the Web page by passing the URL.
        	  
        	  
        	  
        	  // UPCASTING ----> Just for the Generalization purpose
        	  
        	  WebDriver B = new ChromeDriver();   // WebDriver Interface is parent for the ChromeDriver child  class
        	  
        	  
        	  
        	  
        	  B.get("https://www.fireflink.com/");
        	  
        	  
		}
}
